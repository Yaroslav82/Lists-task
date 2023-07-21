package app.task_02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    private static void printInitialList(List<String> list) {
        System.out.println("Initial list:");
        print(list);
    }

    private static void printCuttedList(List<String> list) {
        System.out.println("List part:");
        print(cutList(list));
    }

    private static void print(List<String> list) {
        int counter = 1;
        for (String name : list) {
            System.out.println(counter + ") " + name);
            counter++;
        }
        System.out.println();
    }

    private static List<String> cutList(List<String> list) {
        return list.subList(1, 3);
    }

    private static ArrayList<String> getData() {
        return new ArrayList<>(List.of("orange", "mango", "banana", "apple", "kiwi", "cherry"));
    }
}
