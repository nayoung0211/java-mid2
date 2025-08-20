package collection.set.javaset;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class JavaSetMain {

    public static void main(String[] args) {
        /*Set<String> hashSet = new HashSet<String>();
        Set<String> linkedHashSet = new LinkedHashSet<String>();
        Set<String> treeSet = new TreeSet<String>();*/

        run(new HashSet<>());//순서 무작위
        run(new LinkedHashSet<>());//넣은 순서대로 보여짐
        run(new TreeSet<>());//데이터의 순서로 보여짐
    }

    private static void run(Set<String> set){
        System.out.println("set = "+set.getClass());

        set.add("C");
        set.add("B");
        set.add("A");
        set.add("1");
        set.add("2");

        Iterator<String> iterator = set.iterator();//iterator 데이터 반복 출력 가능
        while(iterator.hasNext()){//다음 데이터가 있는지 확인
            System.out.print(iterator.next()+" ");//다음 데이터 반환
        }
        System.out.println();
    }
}
