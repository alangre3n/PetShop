package org.example;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public abstract class Animal implements IVoice{
    protected final String name;
    protected int age;
    protected double price;

    public Animal(String name, int age, double price) {
        this.name = name;
        this.age = age;
        this.price = price;
    }

    public abstract void voice(byte catFood);

    @Override
    public String toString() {
        return "Animal" +
                "name '" + name + '\'' +
                ", age " + age +
                ", price " + price ;

    }
}

