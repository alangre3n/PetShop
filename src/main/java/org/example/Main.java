package org.example;

public class Main {
    public static void main(String[] args) {
        PetShop shop = new PetShop();
        Man man = new Man("John Connor", 41, 1);

        Animal cat = shop.getAnimal(AnimaType.CAT);
        Animal dog = shop.getAnimal(AnimaType.DOG);

        //man.buyPet(cat);
        //man.buyPet(dog);
        shop.sell(man, cat);
        shop.sell(man, dog);
    }
}
