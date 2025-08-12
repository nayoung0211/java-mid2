package generic.ex3;

public class AnimalHospitalV2<T> {

    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    public void checkUp(){
        //T의 타입을 메서드를 정의하는 시점에는 알 수 없다. Object의 기능만 사용 어떤 타입으로 들어올지 몰라서 메소드 사용불가
        animal.toString();
        animal.equals(null);
        //System.out.println("name is " + animal.getName());
        //System.out.println("size is " + animal.getSize());
        //animal.sound();
    }

    public T bigger(T target){
       // return animal.getSize() > target.getSize() ? animal : target;
        return null;
    }
}
