package javaCollectionsFramework.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListRunner {

    public static void main(String[] args) {

        List<Integer> linkedList = new LinkedList<>();
        List<Integer> arrayList = new ArrayList<>();

        measure(linkedList);
        measure(arrayList);
    }

    public static void measure(List<Integer> list) {

        long start = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++)
            list.add(i);
        long end = System.currentTimeMillis();

        System.out.println("Insert: " + (end - start));

    }
}
