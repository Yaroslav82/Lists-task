package app.task_01;

import java.util.List;

public class Main {

    private static void print(List<String> list) {
        int counter = 1;
        for (String name : list) {
            System.out.println(counter + ") " + name);
            counter++;
        }
    }

    private static List<String> getData() {
        return List.of("John", "Alice", "Robert", "Lisa", "David", "Amanda");
    }
}
