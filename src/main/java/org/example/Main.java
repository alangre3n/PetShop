package org.example;

public class Main {
    public static void main(String[] args) {
        PetShop shop = new PetShop();
        Man man = new Man("John Connor", 41, 1000);

        Animal cat = shop.getAnimal(AnimaType.CAT);
        Animal dog = shop.getAnimal(AnimaType.DOG);

        shop.sell(man, cat);
        shop.sell(man, dog);
    }
}
