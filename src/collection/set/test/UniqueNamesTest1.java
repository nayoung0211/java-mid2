package collection.set.test;

import java.util.HashSet;
import java.util.Set;

public class UniqueNamesTest1 {

    public static void main(String[] args) {

        Integer[] inputArr = {30, 20, 20, 10, 10};
        Set<Integer> set = new HashSet<>();
        //값을 넣고
        for (Integer s: inputArr) {
            set.add(s);
        }
        //출력하기
        for(Integer s: set) {
            System.out.println(s);
        }


    }
}
