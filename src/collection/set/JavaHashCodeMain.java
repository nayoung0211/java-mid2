package collection.set;

import collection.set.member.Member;

public class JavaHashCodeMain {

    public static void main(String[] args) {
        //Object 의 기본 hashCode 는 객체의 참조값을 기반으로 생성
        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());

        //각 클래스마다 hashCode 를 이미 오버라이딩 해두었다
        Integer i = 10;
        String strA = "A";
        String strB = "AB";

        System.out.println(i.hashCode());
        System.out.println(strA.hashCode());
        System.out.println(strB.hashCode());

        //hashCode 는 마이너스값이 들어올 수 있다.
        System.out.println(Integer.valueOf(-1).hashCode());

        //둘은 같을까?
        Member member1 = new Member("idA");
        Member member2 = new Member("idA");

        //equals,hashcode 를 오버라이팅 하지 않은 경우와, 한 경우를 비교
        System.out.println("member1 == member2"+(member1==member2));
        System.out.println("member1.equals(member2)"+(member1.equals(member2)));
        System.out.println("member1.hashCode()"+member1.hashCode());
        System.out.println("member2.hashCode()"+member2.hashCode());

    }
}
