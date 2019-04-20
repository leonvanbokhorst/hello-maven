package com.leonvanbokhorst;

import static org.junit.jupiter.api.Assertions.*;

class LogTesterTest {

    @org.junit.jupiter.api.Test
    void shoutShouldReturnTrue() {
        LogTester sut = new LogTester();

        assertTrue(sut.shout(true));
    }

    @org.junit.jupiter.api.Test
    void shoutShouldReturnFalse() {
        LogTester sut = new LogTester();

        assertFalse(sut.shout(false));
    }
}