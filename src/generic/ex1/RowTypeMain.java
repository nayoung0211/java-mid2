package generic.ex1;

public class RowTypeMain {
    public static void main(String[] args) {
        GenericBox integerBox = new GenericBox();
        //지정 안한 것을 Row 타입이라고 함
        //GenericBox<Object> objectBox = new GenericBox<>(); 권장
        integerBox.set(10);
        Integer result = (Integer) integerBox.get();
        System.out.println("result = "+result);

    }
}
