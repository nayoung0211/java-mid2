package collection.array;

public class MyArrayListV3Main {

    public static void main(String[] args) {
        MyArrayListV3 list = new MyArrayListV3();

        //마지막에 추가 0(1)
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);

        //원하는 위치에 추가
        System.out.println("addLast");
        list.add(3,"d");
        System.out.println(list);

        System.out.println("addFirst");
        list.add(0,"Fist");
        System.out.println(list);

        System.out.println("remove");
        Object remove = list.remove(1);
        System.out.println(remove);
        System.out.println(list);
    }
}