package ru.spring.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import ru.spring.example.entity.animal.Pet;

@Component
public class PetService {
    private Pet pet1;
    private Pet pet2;


    @Autowired
    public PetService(@Qualifier("dog") Pet pet1,
                      @Qualifier("cat") Pet pet2) {
        this.pet1 = pet1;
        this.pet2 = pet2;
    }

    public Pet getPet1() {
        return pet1;
    }

    public Pet getPet2() {
        return pet2;
    }

    public void showPets() {
        System.out.println("Pet1 - " + getPet1() + "; Pet2 - " + getPet2());
    }
}
