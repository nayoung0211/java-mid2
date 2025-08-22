package collection.compare;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SortMain4 {
    public static void main(String[] args) {
        MyUser myUser = new MyUser("a",30);
        MyUser myUser1 = new MyUser("b",20);
        MyUser myUser2 = new MyUser("c",10);

        List<MyUser> list = new LinkedList<>();
        list.add(myUser);
        list.add(myUser1);
        list.add(myUser2);
        System.out.println("기본 데이터");
        System.out.println(list);

        System.out.println("Comparable 기본 정렬");
        list.sort(null);
        System.out.println(list);

        System.out.println("IdComparator 정렬");
        //list.sort(new IdComparator());
        Collections.sort(list,new IdComparator());
        System.out.println(list);
    }
}
