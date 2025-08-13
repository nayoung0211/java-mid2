package collection.array;

public class MyArrayListV1Main {

    public static void main(String[] args) {
        MyArrayListV1 list = new MyArrayListV1();
        System.out.println("--add data--");
        System.out.println(list);
        list.add("a");
        System.out.println(list);
        list.add("b");
        System.out.println(list);
        list.add("c");
        System.out.println(list);

        System.out.println("--use service--");
        System.out.println("list size ="+list.size());
        System.out.println("list.get(1) = "+list.get(1));
        int c = list.indexOf("c");
        System.out.println("c ="+c);
        list.set(0, "d");
        System.out.println(list);

        System.out.println("--over data--");
        list.add("e");
        System.out.println(list);
        list.add("f");
        System.out.println(list);
        //list.add("g");
        //System.out.println(list); 범위를 초과하면 오류남

    }
}
