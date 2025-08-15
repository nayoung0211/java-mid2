package collection.set;

public class MyHashSetV0Main {
    public static void main(String[] args) {
        MyHashSetV0 myHashSet = new MyHashSetV0();
        myHashSet.add(1);
        myHashSet.add(2);
        myHashSet.add(3);
        myHashSet.add(4);
        myHashSet.add(5);
        System.out.println(myHashSet);

        boolean result = myHashSet.add(4);
        System.out.println(myHashSet);
        System.out.println(result);

        boolean  contains = myHashSet.contains(3);
        System.out.println(contains);
        boolean contains2 = myHashSet.contains(100);
        System.out.println(contains2);
    }
}
