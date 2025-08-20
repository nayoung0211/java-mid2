package collection.set.test;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class UniqueNamesTest2 {

    public static void main(String[] args) {

        Integer[] inputArr = {30, 20, 20, 10, 10};
        //중복을 제거하고 입력한 순서대로 출력하기
        /*Set<Integer> set = new LinkedHashSet<>();
        //값을 넣고
        for (Integer s: inputArr) {
            set.add(s);
        }*/

        //만들때 한번에 값 넣기
        Set<Integer> set = new LinkedHashSet<>(List.of(inputArr));
        //출력하기
        for(Integer s: set) {
            System.out.println(s);
        }

    }
}
