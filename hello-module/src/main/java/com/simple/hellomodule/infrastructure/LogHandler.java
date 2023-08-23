package com.simple.hellomodule.infrastructure;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class LogHandler {

    private static final Logger LOGGER = LogManager.getLogger(LogHandler.class);

    public void logInfo(String message) {
        LOGGER.info(message);
    }

    public void logError(String message) {
        LOGGER.error(message);
    }
}
