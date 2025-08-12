package generic.ex1;

public class BoxMain3 {
    public static void main(String[] args) {
        GenericBox<Integer> integerBox = new GenericBox<>();
        //생성 시점에 T의 타입이 결정됨
        integerBox.set(10);
        //integerBox.set("20"); 컴파일 오류
        Integer integer = integerBox.get();//인티저 타입 반환 캐스팅 필요 없음
        System.out.println("Integer = "+integer);

        GenericBox<String> stringBox = new GenericBox<>();
        stringBox.set("test");
        String string = stringBox.get();
        System.out.println("String = "+string);

        //원하는 모든 타입 사용 가능
        //타입 추론 : 생성하는 제네릭 타입 생략 가능
        GenericBox<Double> doubleBox = new GenericBox<>();
        doubleBox.set(10.0);
        Double double2 = doubleBox.get();
        System.out.println("Double = "+double2);
    }
}
