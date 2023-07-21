package app.task_02;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static List<String> cutList(List<String> list) {
        return list.subList(1, 3);
    }

    private static ArrayList<String> getData() {
        return new ArrayList<>(List.of("orange", "mango", "banana", "apple", "kiwi", "cherry"));
    }
}
