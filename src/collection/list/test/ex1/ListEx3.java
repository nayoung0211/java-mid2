package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class ListEx3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("정수입력");

        while(true){
            int n = sc.nextInt();
            if(n == 0){
                break;
            }
            list.add(n);
        }
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        double average = (double) sum / list.size();
        System.out.println(average);
        System.out.println(sum);
    }
}
