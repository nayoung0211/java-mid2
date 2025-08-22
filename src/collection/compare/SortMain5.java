package collection.compare;

import java.util.TreeSet;

public class SortMain5 {

    public static void main(String[] args) {

        MyUser myUser = new MyUser("a", 30);
        MyUser myUser1 = new MyUser("b", 20);
        MyUser myUser2 = new MyUser("c", 10);

        TreeSet<MyUser> treeSet = new TreeSet<>();
        treeSet.add(myUser);
        treeSet.add(myUser1);
        treeSet.add(myUser2);
        System.out.println("Comparable 기본 정렬");
        System.out.println(treeSet);

        TreeSet<MyUser> treeSet1 = new TreeSet<>(new IdComparator());
        treeSet1.add(myUser);
        treeSet1.add(myUser1);
        treeSet1.add(myUser2);
        System.out.println("IdComparator 정렬");
        System.out.println(treeSet1);

    }
}
