package app.task_03;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> list = getData();

        printInitialList(list);

        printEditedList(list);
    }

    private static void printInitialList(LinkedList<String> list) {
        System.out.println("Initial list:");
        print(list);
    }

    private static void printEditedList(LinkedList<String> list) {
        System.out.println("Edited list:");
        addProducts(list);
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

    private static void addProducts(LinkedList<String> list) {
        list.addFirst("plum");
        list.addLast("mango");
    }

    private static LinkedList<String> getData() {
        return new LinkedList<>(List.of("orange", "grape", "apple", "lemon"));
    }
}
