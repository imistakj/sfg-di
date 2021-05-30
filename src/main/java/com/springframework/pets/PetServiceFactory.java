package com.springframework.pets;

public class PetServiceFactory {
    public PetService getPatService(String petType){

        switch (petType){
            case "dog" :
                return new DogPetService();
            case "cat" :
                return new CatPetService();
            default:
                return new DogPetService();
        }
    }
}
