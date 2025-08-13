package generic.ex3;

import generic.animal.Animal;

public class AnimalHospitalV3<T extends Animal> {

    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    public void checkUp(){
        System.out.println("name is " + animal.getName());
        System.out.println("size is " + animal.getSize());
        animal.sound();
    }

    public T bigger(T target){
       return animal.getSize() > target.getSize() ? animal : target;
    }
}

