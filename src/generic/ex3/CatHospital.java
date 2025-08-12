package generic.ex3;

import generic.animal.Cat;

public class CatHospital {
    private Cat animal;

    public void set(Cat animal) {
        this.animal = animal;
    }

    public void checkUp(){
        System.out.println("name is " + animal.getName());
        System.out.println("size is " + animal.getSize());
        animal.sound();
    }

    public Cat bigger(Cat target){
        return animal.getSize() > target.getSize() ? animal : target;
    }
}
