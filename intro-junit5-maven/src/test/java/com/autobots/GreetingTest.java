package com.autobots;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class GreetingTest {

    Greeting greeting;

    @BeforeAll
    static void beforeAll() {
        System.out.println("Before - I am only called once..");
    }

    @BeforeEach
    void setUp() {
        System.out.println("In Before Each...");
        greeting = new Greeting();
    }

    @Test
    void helloWorld() {
        System.out.println(greeting.helloWorld());
    }

    @Test
    void hello() {
        System.out.println(greeting.hello("Optimus"));
    }

    @AfterEach
    void tearDown() {
        System.out.println("In After Each...");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("After - I am only called once..");
    }
}