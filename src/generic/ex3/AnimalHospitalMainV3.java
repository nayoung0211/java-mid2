package generic.ex3;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV3 {
    public static void main(String[] args) {
        AnimalHospitalV3<Dog> dog = new AnimalHospitalV3<>();
        AnimalHospitalV3<Cat> cat = new AnimalHospitalV3<>();
        AnimalHospitalV3<Animal> animal = new AnimalHospitalV3<>();
        //AnimalHospitalV3<Integer> integer = new AnimalHospitalV3<>();
        //다른 타입을 들어갈 수 없음


        Dog dog1 = new Dog("dog1",100);
        Cat cat1 = new Cat("cat1",200);

        //dog
        dog.set(dog1);
        dog.checkUp();

        //cat
        cat.set(cat1);
        cat.checkUp();

        //문제 1 개 병원에 고양이 전달
        //dog.set(cat1); 다른 타입을 넣을 수 없음

        //문제 2 개 타입을 반환
        dog.set(dog1);
        Dog sizeCheck = dog.bigger(new Dog("dog2",200));
        System.out.println(sizeCheck);
    }
}
