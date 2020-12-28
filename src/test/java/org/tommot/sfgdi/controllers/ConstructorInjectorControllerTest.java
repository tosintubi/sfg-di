package org.tommot.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.tommot.sfgdi.services.ConstructorGreetingService;

class ConstructorInjectorControllerTest {

    ConstructorInjectorController controller;
    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectorController(new ConstructorGreetingService());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}