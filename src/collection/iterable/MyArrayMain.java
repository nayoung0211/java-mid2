package collection.iterable;

import java.util.Iterator;

public class MyArrayMain {

    public static void main(String[] args) {
        MyArray  myArray = new MyArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        Iterator<Integer> iterator = myArray.iterator();
        System.out.println("iterator 사용");

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        //추가
        System.out.println("for-each iterator");
        for(int value : myArray) {
            System.out.println(value);
        }
    }
}
