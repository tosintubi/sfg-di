package org.tommot.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.tommot.sfgdi.services.ConstructorGreetingService;

class SetterInjectedControllerTest {

    SetterInjectedController controller;
    @BeforeEach
    void setUp() {
        // We used setter method here.
        controller = new SetterInjectedController();
        controller.setGreetingService(new ConstructorGreetingService());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}