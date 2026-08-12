import java.util.*;

public class departmentnames {
            public static void main(String[] args) {
            List<List<String>> departments = Arrays.asList(
            Arrays.asList("CSE", "ECE"),
            Arrays.asList("CSE", "IT"),
            Arrays.asList("EEE", "IT")
        );
        departments.stream()
                    .flatMap(list -> list.stream())
                    .filter(name -> name.startsWith("C"))
                    .distinct()
                    .forEach(System.out::println);
    }
}
