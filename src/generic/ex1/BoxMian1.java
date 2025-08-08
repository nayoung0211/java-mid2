package generic.ex1;

public class BoxMian1 {
    public static void main(String[] args) {
        IntegerBox box = new IntegerBox();
        box.set(10);//오토 박싱
        Integer integer = box.get();
        System.out.println("Integer = "+integer);

        StringBox stringBox = new StringBox();
        stringBox.set("test");
        String string = stringBox.get();
        System.out.println("String Box = "+string);
    }

}
