package nextstep.fp;

import java.util.List;
import java.util.function.Predicate;

public class Lambda {

    public static void printAllOld(List<Integer> numbers) {
        System.out.println("printAllOld");

        numbers.forEach(System.out::println);
    }

    public static void printAllLambda(List<Integer> numbers) {
        System.out.println("printAllLambda");

        numbers.forEach(System.out::println);
    }

    public static void runThread() {
        new Thread(() -> System.out.println("Hello from thread")).start();
    }

    public static int sumByCondition(List<Integer> numbers, Predicate<Integer> condition) {
        return numbers.stream()
            .filter(condition)
            .mapToInt(Integer::intValue)
            .sum();
    }

}
