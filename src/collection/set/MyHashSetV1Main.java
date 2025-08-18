package collection.set;

public class MyHashSetV1Main {

    public static void main(String[] args) {
        MyHashSetV1 set = new MyHashSetV1(10);
        set.add(1);
        set.add(2);
        set.add(5);
        set.add(8);
        set.add(14);
        set.add(99);
        set.add(9);

        System.out.println(set);

        //검색
        int value = 9;
        boolean contains = set.contains(value);
        System.out.println(contains);

        //삭제
        boolean removeResult = set.remove(value);
        System.out.println(removeResult);
    }
}
