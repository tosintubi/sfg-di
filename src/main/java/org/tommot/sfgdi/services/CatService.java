package org.tommot.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("cat")
public class CatService  implements PetService{
    @Override
    public String getPetType() {
        return "Cat is the best animal";
    }
}
