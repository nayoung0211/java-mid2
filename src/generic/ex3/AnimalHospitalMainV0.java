package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV0 {
    public static void main(String[] args) {

        DogHospital d = new DogHospital();
        CatHospital c = new CatHospital();

        Dog dog1 = new Dog("dog1", 100);
        Cat cat1 = new Cat("cat1", 200);

        //dog

        d.set(dog1);
        d.checkUp();

        //cat
        c.set(cat1);
        c.checkUp();

        //문제 1 개 병원에 고양이 전달
        //d.set(cat1);-> 다른 타입을 입력시 컴파일 오류

        //문제 2 개 타입을 반환
        d.set(dog1);
        Dog sizeCheck = d.bigger(new Dog("dog2", 200));
        System.out.println(sizeCheck);
    }
}
