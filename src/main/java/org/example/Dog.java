package org.example;

public class Dog extends Animal {

    public Dog(String name, int age, double price) {
        super(name, age, price);
    }

    public void voice() {
        System.out.println("Wuf Wuf!");
    }

    public void voice(byte dogFood){
        if(dogFood<5){
            voice();
        } else {
            System.out.println(".............");
        }
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", price=" + price +
                '}';
    }
}
