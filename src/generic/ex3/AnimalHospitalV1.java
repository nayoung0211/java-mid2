package generic.ex3;

import generic.animal.Animal;

public class AnimalHospitalV1 {

    private Animal animal;

    public void set(Animal animal) {
        this.animal = animal;
    }

    public void checkUp(){
        System.out.println("name is " + animal.getName());
        System.out.println("size is " + animal.getSize());
        animal.sound();
    }
    public Animal bigger(Animal target){
        return animal.getSize() > target.getSize() ? animal : target;
    }
}
