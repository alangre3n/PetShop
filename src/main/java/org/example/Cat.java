package org.example;

public class Cat extends Animal {

    public Cat(String name, int age, double price) {
        super(name, age, price);
    }

    public void voice() {
        System.out.println("Meooooooooooow");
    }

    public void voice(byte catFood){
        if(catFood<2){
            voice();
        } else {
            System.out.println(".............");
        }
    }

    @Override
    public String toString() {
        return "Cat " +
                 name +
                ", age= " + age +
                ", price= " + price;
    }
}
