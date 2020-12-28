package org.tommot.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.tommot.sfgdi.services.GreetingService;

@Controller
public class ConstructorInjectorController {

    private final GreetingService greetingService;

   // For constructor injection, we don't explicitly have to specify the @Autowired annotation on the constructor,
   // instead we set the @Qualifier annotation for the controller to specify the GreetingService we need
    public ConstructorInjectorController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}

