package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV1 {
    public static void main(String[] args) {
        AnimalHospitalV1 dog = new AnimalHospitalV1();
        AnimalHospitalV1 cat = new AnimalHospitalV1();

        Dog dog1 = new Dog("dog1",100);
        Cat cat1 = new Cat("cat1",100);

        //dog

        dog.set(dog1);
        dog.checkUp();

        //cat
        cat.set(cat1);
        cat.checkUp();

        //문제 1 개 병원에 고양이 전달
        dog.set(cat1);//다른 타입이 들어가도 오류가 나지 않음

        //문제 2 개 타입을 반환
        dog.set(dog1);
        Dog sizeCheck = (Dog)dog.bigger(new Dog("dog2",200));
        System.out.println(sizeCheck);
    }
}
