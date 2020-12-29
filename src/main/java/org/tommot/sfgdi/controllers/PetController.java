package org.tommot.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.tommot.sfgdi.services.PetService;

@Controller
public class PetController {
    private final PetService petService;

    public PetController( PetService petService) {
        this.petService = petService;
    }

    public String whichPetIsBetter() {
        return petService.getPetType();
    }
}
