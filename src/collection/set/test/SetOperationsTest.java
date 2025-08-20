package collection.set.test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetOperationsTest {

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(List.of(1,2,3,4,5));
        Set<Integer> set2 = new HashSet<>(List.of(3,4,5,6,7));


        //합집합
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set1);
        union.addAll(set2);
        System.out.println(union);

        //교집합
        Set<Integer> intersection = new HashSet<>(set1);
        //겹치는 것만 남기고 나머지는 없앰
        intersection.retainAll(set2);

        //차집합 -> 다 뻬버리기
        Set<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        System.out.println(difference);


        System.out.println(intersection);


    }
}
