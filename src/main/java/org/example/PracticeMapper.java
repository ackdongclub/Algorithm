package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeMapper {
    public static void main(String[] args) {
        List<Map<String, Object>>listMap = new ArrayList<>();

        Map<String, Object> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("two", 3);
        map.put("two", 4);
        listMap.add(map);

        for(Map<String, Object> i : listMap) {
            System.out.println(map.get("one") + "   " + i);
        }
    }
}
