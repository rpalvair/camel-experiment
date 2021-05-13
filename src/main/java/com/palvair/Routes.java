package com.palvair;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class Routes extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        restConfiguration().host("localhost").port(8080);
        from("direct:start")
                .to("rest:get:hello");

        from("direct:say-hello")
                .to("rest:post:say/hello");

        from("direct:bye")
                .transform().constant("Bye World")
                .bean(MyBean.class, "receive");

        from("file:src/data")
                .to("rest:post:files/read");
    }
}
