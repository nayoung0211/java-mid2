package collection.array;

public class MyArrayListV3BadMain {

    public static void main(String[] args) {
        MyArrayListV3 list = new MyArrayListV3();
        //숫자만 입력하기를 기대
        list.add(1);
        list.add(2);
        list.add("문자3");
        System.out.println(list);

        //Object 를 반환하므로 다운캐스팅 필요
        Integer num1 = (Integer) list.get(0);
        System.out.println(num1);
        Integer num2 = (Integer) list.get(1);
        System.out.println(num2);
        //예외 발생
        Integer num3 = (Integer) list.get(2);
        System.out.println(num3);
    }
}
