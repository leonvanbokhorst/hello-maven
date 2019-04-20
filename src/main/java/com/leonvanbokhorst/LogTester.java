package com.leonvanbokhorst;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class LogTester {

    private static final Logger log = LoggerFactory.getLogger(HelloMaven.class);

    boolean shout(boolean returnAValue) {
        log.info("Hello info");
        log.debug("Hello debug");
        log.error("Boom!");

        return returnAValue;
    }
}