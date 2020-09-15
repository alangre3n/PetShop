package org.example;

public class PetShop {
    private Animal dog = new Dog("Rex",4, 1000);
    private Animal cat = new Cat("Murzik",2, 800);

    public PetShop() {
        System.out.println("Welcome to our PetShop");
        System.out.println("We have one cat and one dog");
    }

    public Animal getAnimal(AnimaType type) {
        switch (type) {
            case CAT:
                return cat;
            case DOG:
                return dog;
            default:
                throw new RuntimeException("wrong type of animal");
        }
    }

    public void sell(Man man, Animal pet){
        if(man.getCash() > pet.getPrice()){
            if(pet instanceof Cat) {
                this.cat = null;
                man.buyPet(pet);
                man.setCash(man.getCash()- pet.getPrice());
            }else{
                this.dog=null;
                man.buyPet(pet);
                man.setCash(man.getCash()- pet.getPrice());
            }
            man.setPet(pet);
        }else{
            System.out.println("You don't have enough money");
        }
    }
}

