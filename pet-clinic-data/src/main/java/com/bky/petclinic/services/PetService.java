package com.bky.petclinic.services;

import com.bky.petclinic.model.Owner;
import com.bky.petclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);
    Pet save(Pet owner);
    Set<Pet> findAll();
}
