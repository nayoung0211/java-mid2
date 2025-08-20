package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class ArrayToMapTest {
    public static void main(String[] args) {
        String[][] productArr = {{"Java", "10000"}, {"Spring", "20000"},
            {"JPA", "30000"}};

        Map<String,Integer> productMap = new HashMap<>();
        for(String[] product: productArr) {
            String key = product[0];
            String value = product[1];
            productMap.put(key, Integer.valueOf(value));
        }
        //데이터 출력
        for (String s : productMap.keySet()) {
            System.out.println(s + " : " + productMap.get(s));
        }
    }
}
