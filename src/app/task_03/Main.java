package app.task_03;

import java.util.LinkedList;
import java.util.List;

public class Main {

    private static void printInitialList(LinkedList<String> list) {
        System.out.println("Initial list:");
        print(list);
    }

    private static void printEditedList(LinkedList<String> list) {
        System.out.println("Edited list:");
        addProducts(list, "plum", "mango");
        print(list);
    }

    private static void print(List<String> list) {
        int counter = 1;
        for (String name : list) {
            System.out.println(counter + ") " + name);
            counter++;
        }
        System.out.println();
    }

    private static void addProducts(LinkedList<String> list, String firstProduct, String lastProduct) {
        list.addFirst(firstProduct);
        list.addLast(lastProduct);
    }

    private static LinkedList<String> getData() {
        return new LinkedList<>(List.of("orange", "grape", "apple", "lemon"));
    }
}
