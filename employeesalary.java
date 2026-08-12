
import java.util.*;

public class employeesalary {
    public static void main(String[] args) {
        List<Integer> salaries = Arrays.asList(25000, 35000, 42000, 28000, 50000);

     salaries.stream()
            .map(salary -> salary + (salary * 10 /100))
            .mapToInt(Integer::intValue)
            .forEach(System.out::println);
    }
}
