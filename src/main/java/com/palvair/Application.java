package com.palvair;

import org.apache.camel.ProducerTemplate;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner initApp(final ProducerTemplate template) {
        return (args) -> {
            template.sendBody("direct:say-hello", "Say hello to my friends!");
            template.sendBody("direct:bye", "This message will be transformed");
        };
    }

}
