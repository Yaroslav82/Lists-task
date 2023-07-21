package app.task_03;

import java.util.LinkedList;
import java.util.List;

public class Main {

    private static void addProducts(LinkedList<String> list, String firstProduct, String lastProduct) {
        list.addFirst(firstProduct);
        list.addLast(lastProduct);
    }

    private static LinkedList<String> getData() {
        return new LinkedList<>(List.of("orange", "grape", "apple", "lemon"));
    }
}
