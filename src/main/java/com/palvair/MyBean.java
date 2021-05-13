package com.palvair;

import org.apache.camel.Exchange;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyBean {

    private static final Logger LOGGER = LoggerFactory.getLogger(MyBean.class);

    private final OtherBean otherBean;

    @Autowired
    public MyBean(final OtherBean otherBean) {
        this.otherBean = otherBean;
    }

    public void receive(final Exchange exchange) {
        LOGGER.info("Message received = {}", exchange.getIn().getBody());
        otherBean.forward((String) exchange.getIn().getBody());
    }
}
