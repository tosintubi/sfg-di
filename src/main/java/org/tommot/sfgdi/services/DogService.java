package org.tommot.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;


@Profile({"dog","default"})
public class DogService implements PetService {
    @Override
    public String getPetType() {
        return "Dog is the best animal";
    }

}
