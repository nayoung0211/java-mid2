package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV2 {
    public static void main(String[] args) {
        AnimalHospitalV2<Dog> dogHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Cat> catHospital = new AnimalHospitalV2<>();
        //전혀 관계 없는 타입이 들어올 수 도  있다
        AnimalHospitalV2<Integer> integer = new AnimalHospitalV2<>();
    }
}
