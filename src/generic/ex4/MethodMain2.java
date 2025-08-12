package generic.ex4;

import generic.animal.Cat;
import generic.animal.Dog;

public class MethodMain2 {

    public static void main(String[] args) {
        Dog dog = new Dog("dog1",100);
        Cat cat = new Cat("cat1",100);

        AnimalMethod.checkUp(dog);
        AnimalMethod.checkUp(cat);

        Dog dog2 = new Dog("dog2",300);

        Dog bigger = AnimalMethod.bigger(dog, dog2);
        System.out.println(bigger);
    }

}
