package collection.compare;

import java.util.Arrays;

public class SortMain3 {
    public static void main(String[] args) {
        MyUser myUser = new MyUser("a",30);
        MyUser myUser1 = new MyUser("b",20);
        MyUser myUser2 = new MyUser("c",10);

        MyUser[] array = {myUser,myUser1,myUser2};
        System.out.println("기본 데이터");
        System.out.println(Arrays.toString(array));

        System.out.println("comparable");
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        //추가
        System.out.println("IdComparator");
        Arrays.sort(array,new IdComparator());
        System.out.println(Arrays.toString(array));

        Arrays.sort(array,new IdComparator().reversed());
        System.out.println(Arrays.toString(array));

    }
}
