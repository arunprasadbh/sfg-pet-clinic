package guru.springframework.sfgpetclinic.services;

/*
 * Created by arunabhamidipati on 03/10/2019
 */

import guru.springframework.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long Id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
