package javaCollectionsFramework.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListRunner {

    public static void main(String[] args) {

        List<Integer> linkedList = new LinkedList<>();
        List<Integer> arrayList = new ArrayList<>();

        measureAdd(linkedList);
        measureAdd(arrayList);

        measureGet(linkedList);
        measureGet(arrayList);

        measureAddFirst(linkedList);
        measureAddFirst(arrayList);

    }

    public static void measureAdd(List<Integer> list) {

        long start = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++)
            list.add(i);
        long end = System.currentTimeMillis();

        System.out.println("Insert: " + (end - start));

    }

    public static void measureAddFirst(List<Integer> list) {

        long start = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++)
            list.add(0, i);
        long end = System.currentTimeMillis();

        System.out.println("Insert: " + (end - start));

    }

    public static void measureGet(List<Integer> list) {

        for (int i = 0; i < 100_000; i++)
            list.add(i);

        long start = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            list.get(i);
        }
        long end = System.currentTimeMillis();

        System.out.println("Get: " + (end - start));

    }

}
