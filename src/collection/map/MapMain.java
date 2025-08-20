package collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMain {
    public static void main(String[] args) {
        Map<String,Integer> student = new HashMap<>();
        student.put("A", 100);
        student.put("B", 90);
        student.put("C", 80);
        student.put("D", 80);
        System.out.println(student);

        //특정 학생의 값 조회
        Integer result = student.get("A");
        System.out.println(result);

        System.out.println("KeySet 활용");
        Set<String> keySet = student.keySet();
        for(String s : keySet) {
            Integer value = student.get(s);//값은 get 으로 찾아옴
            System.out.println(s+":"+value);
        }
        //값 목록의 중복 허용
        System.out.println("entrySet 활용");
        Set<Map.Entry<String,Integer>> entrySet = student.entrySet();
        for(Map.Entry<String,Integer> entry : entrySet) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key+":"+value);
        }

        System.out.println("values 활용");
        Collection<Integer> values = student.values();
        for(Integer value : values) {
            System.out.println(value);
        }
    }
}
