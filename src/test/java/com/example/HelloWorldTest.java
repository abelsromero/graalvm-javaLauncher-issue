package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloWorldTest {

    @Test
    void greetingReturnsExpectedMessage() {
        assertEquals("Hello, World from GraalVM Native Image!", HelloWorld.greeting());
    }
}
