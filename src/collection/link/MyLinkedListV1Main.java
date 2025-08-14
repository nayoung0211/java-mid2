package collection.link;


public class MyLinkedListV1Main {

    public static void main(String[] args) {
        MyLinkedListV1 list = new MyLinkedListV1();
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
    }
}
