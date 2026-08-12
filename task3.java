
// //Write a  program to print all student names from a list using the forEach() method.
// import java.util.*;
// public class task3 {
//     public static void main(String[] args) {
//         List<String>students = Arrays.asList("Afrid" ,"munna");
//         students.forEach(name -> System.out.println(name));
//     }
// }

// // Write a  program to store all even numbers from a list into a new list using the collect() method and display the new list.

// import java.util.*;
// import java.util.stream.Collectors;

// public class task3 {
//     public static void main(String[] args) {
//        List<Integer>num = Arrays.asList( 1,2,3,4,5,6,7,8,9,0 );
//        List<Integer>even = num.stream()
//        .filter(n -> n % 2 == 0)
//        .collect(Collectors.toList());
//        System.out.println(even);

//     }
// }


// Write a  program to count how many students scored 50 or more marks using the count() method.
import java.util.*;
import java.util.stream.Collectors;

public class task3 {
    public static void main(String[] args) {
       List<Integer>num = Arrays.asList( 11,22,33,44,55,66,77,88,99,100 );
       List<Integer>even = num.stream()
       .filter(n -> n % 2 == 0)
       .collect(Collectors.toList());
       System.out.println(even);

    }
}