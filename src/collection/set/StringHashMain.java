package collection.set;

public class StringHashMain {

    static final int CAPACITY = 10;

    public static void main(String[] args) {
        //char
        char charA = 'A';
        char charB = 'B';

        //문자를 숫자로 바꿀때는 유니코드를 사용
        System.out.println("charA = " + (int) charA);
        System.out.println("charB = " + (int) charB);

        //hashCode
        System.out.println("hashCode('A') = " + hashCode("A"));
        System.out.println("hashCode('B') = " + hashCode("B"));
        System.out.println("hashCode('A+B') = " + hashCode("AB"));

        //hashIndex
        System.out.println("hashCode('A') = " + hashIndex(hashCode("A")));
        System.out.println("hashCode('B') = " + hashIndex(hashCode("B")));
        System.out.println("hashCode('A+B') = " + hashIndex(hashCode("AB")));
    }

    static int hashCode(String str) {
        char[] charArray = str.toCharArray();
        int sum = 0;
        for (char c : charArray) {
            sum = sum + (int) c;
        }
        return sum;
    }

    static int hashIndex(int hash) {
        return hash % CAPACITY;
    }
}
