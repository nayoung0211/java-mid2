package collection.set.test;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class UniqueNamesTest3 {

    public static void main(String[] args) {
        //중복을 제거하고 입력한 순서대로 출력하기
        /*Set<Integer> set = new LinkedHashSet<>();
        //값을 넣고
        for (Integer s: inputArr) {
            set.add(s);
        }*/

        //만들때 한번에 값 넣기,데이터값 정렬
        Set<Integer> set = new TreeSet<>(List.of(30,20,20,10,10));
        //출력하기
        for(Integer s: set) {
            System.out.println(s);
        }
    }
}
