package javaCollectionsFramework.map;

import java.util.HashMap;
import java.util.Map;

public class Test {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "String1");
        map.put(2, "String2");
        map.put(3, "String3");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry);
        }
    }
}
