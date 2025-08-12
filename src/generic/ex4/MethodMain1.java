package generic.ex4;

public class MethodMain1 {

    public static void main(String[] args) {
        Integer i = 10;
        Object i1 = GenericMethod.objMethod(i);
        System.out.println(i1);

        //다운캐스팅
        Integer i2 = (Integer) GenericMethod.objMethod(i);
        //타입 인자(Type Argument) 명시적 전달
        System.out.println("명시적 타입 인자 전달");
        Integer i3 = GenericMethod.<Integer>genericMethod(i);
        System.out.println(i3);
        Integer int2 = GenericMethod.<Integer>numberMethod(10);
        System.out.println(int2);
        String hello = GenericMethod.<String>genericMethod("hello");
        System.out.println(hello);

        System.out.println("타입 추론");
        Integer result = GenericMethod.genericMethod(i);
        System.out.println(result);
        Integer integerValue2 = GenericMethod.numberMethod(10);
        System.out.println(integerValue2);
        Double doubleValue = GenericMethod.numberMethod(0.5);
        System.out.println(doubleValue);
    }
}
