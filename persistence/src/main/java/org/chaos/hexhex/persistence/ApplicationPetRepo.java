package org.chaos.hexhex.persistence;

import org.chaos.hexhex.application.Pet;
import org.chaos.hexhex.application.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ApplicationPetRepo implements PetRepository {

    @Autowired
    private org.chaos.hexhex.persistence.PetRepository petRepository;

    @Override
    public Pet getPet(String byName) {
        return mapToApplicationPet(petRepository.findPetByName(byName));
    }

    private Pet mapToApplicationPet(org.chaos.hexhex.persistence.Pet petByName) {
        Pet pet = new Pet();
        pet.setName(petByName.getName());
        return pet;
    }
}
