package org.example;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class Man {
    private String name;
    private int age;
    private Animal pet;
    private double cash;

    public Man(String name, int age, double cash) {
        this.name = name;
        this.age = age;
        this.cash = cash;
    }

    public void buyPet(Animal animal) {
        this.pet=animal;
        System.out.println(name+ " buy " + pet.toString() + '\'');
    }
}
