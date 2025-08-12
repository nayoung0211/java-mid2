package generic.ex4;

import generic.animal.Cat;
import generic.animal.Dog;

public class MethodMain3 {

    public static void main(String[] args) {
        Dog dog = new Dog("dog1",100);
        Cat cat = new Cat("cat1",100);

        CompleBox<Dog> hospital = new CompleBox<>();
        hospital.set(dog);

        Cat returnCat = hospital.printAndReturn(cat);
        System.out.println("returnCat = "+returnCat);
    }
}
