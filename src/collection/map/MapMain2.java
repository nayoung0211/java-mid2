package collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapMain2 {
    public static void main(String[] args) {
        Map<String,Integer> studentMap = new HashMap<>();

        //학생 성적 데이터 추가
        studentMap.put("studentA",90);
        System.out.println(studentMap);
        //System.out.println(studentMap.get("studentA"));->90

        studentMap.put("studentA",100);//같은 키에 저장시 기존 값 교체
        System.out.println(studentMap);

        boolean containsKey = studentMap.containsKey("studentA");
        System.out.println(containsKey);

        //특정 학생의 값 삭제
        studentMap.remove("studentA");//키로 지우면 값도 다 날라감
        System.out.println(studentMap);


    }
}
