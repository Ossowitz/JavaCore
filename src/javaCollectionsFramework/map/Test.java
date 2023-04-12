package javaCollectionsFramework.map;

import java.util.HashMap;
import java.util.Map;

public class Test {

    public static void main(String[] args) {

        Map<Integer, Integer> map = new HashMap<>();

        map.put(1, 10);
        map.put(2, 5);
        map.put(3, 5);

        map.merge(1, 5, (x1, x2) -> (x1 % 2 == 0) ? 1 : 0);

        System.out.println(map);

    }
}
