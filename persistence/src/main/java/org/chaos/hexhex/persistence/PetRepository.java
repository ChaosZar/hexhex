package org.chaos.hexhex.persistence;

import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Integer> {

    Pet findPetByName(String name);

}
