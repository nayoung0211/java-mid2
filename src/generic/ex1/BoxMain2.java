package generic.ex1;

public class BoxMain2 {

    public static void main(String[] args) {
        ObjectBox integerBox = new ObjectBox();
        integerBox.set(10);
        Integer integer = (Integer)integerBox.get();//오브젝트 -> 인티저 캐스팅
        System.out.println("Integer = "+integer);

        ObjectBox stringBox = new ObjectBox();
        stringBox.set("test");
        String string = (String)stringBox.get(); //오브젝트 -> 스트링 캐스팅
        System.out.println("String = "+string);

        integerBox.set("문자100");//잘못된 타입의 인수 전달시
        Integer integer2 = (Integer)integerBox.get();
        System.out.println("Integer = "+integer2);
    }
}
