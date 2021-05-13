package com.palvair;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class OtherBean {
    private static final Logger LOGGER = LoggerFactory.getLogger(OtherBean.class);

    public void forward(final String message) {
        LOGGER.info("{}...", message);
    }
}
