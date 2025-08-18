package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class HashStart5 {

    static final int CAPACITY = 10;

    public static void main(String[] args) {
        //{1,2,5,8,14,99}
        LinkedList<Integer>[] buckets = new LinkedList[CAPACITY];
        for (int i = 0; i < CAPACITY; i++) {
            //초기화
            buckets[i] = new LinkedList<>();
        }
        System.out.println("buckets = "+ Arrays.toString(buckets));
        add(buckets,1);
        add(buckets,2);
        add(buckets,5);
        add(buckets,8);
        add(buckets,14);
        add(buckets,99);
        add(buckets,9);//중복
        System.out.println("buckets = "+ Arrays.toString(buckets));

        //검색
        boolean contains = contains(buckets, 1);
        System.out.println(contains);
        boolean contains1 = contains(buckets, 2);
        System.out.println(contains1);
        boolean contains2 = contains(buckets, 5);
        System.out.println(contains2);
        boolean contains3 = contains(buckets, 8);
        System.out.println(contains3);
        boolean contains4 = contains(buckets, 14);
        System.out.println(contains4);
        boolean contains5 = contains(buckets, 99);
        System.out.println(contains5);

        int searchValue = 9;
        boolean contains6 = contains(buckets, searchValue);
        System.out.println(contains6);

    }
    private static void add(LinkedList<Integer>[] buckets, int value) {
        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = buckets[hashIndex];
        if(!bucket.contains(value)) {
            bucket.add(value);
        }
    }
    static int hashIndex(int value){
        return value % CAPACITY;
    }
    private static boolean contains(LinkedList<Integer>[] buckets, int searchValue) {
        int hashIndex = hashIndex(searchValue);
        LinkedList<Integer> bucket = buckets[hashIndex];
        return bucket.contains(searchValue);
    }
}
