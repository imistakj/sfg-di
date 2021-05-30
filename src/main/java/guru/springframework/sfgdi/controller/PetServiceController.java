package guru.springframework.sfgdi.controller;

import com.springframework.pets.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PetServiceController {

    private final PetService petService;

    PetServiceController(PetService petService){
        this.petService = petService;
    }

    public String whichPetIsbest() {
        return petService.getPetType();
    }
}
