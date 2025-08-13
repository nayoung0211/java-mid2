package generic.ex5;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class WildcardMain2 {

    public static void main(String[] args) {
        Box<Object> objBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();
        Box<Animal> animalBox = new Box<>();

        //Animal포함 상위 타입 전달 가능
       writeBox(objBox);
       writeBox(animalBox);
       //writeBox(catBox);
    }

    static void writeBox(Box<? super Animal> box){
        box.set(new Animal("dog1",100));
    }
}
