package com.bky.petclinic.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Pet extends BaseEntity{
    private PetType petType;
    private Owner owner;
    private LocalDate birthday;
}
