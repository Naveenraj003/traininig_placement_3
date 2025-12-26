import java.util.*;
import java.util.stream.*;

class StreamDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30);

        List<Integer> evenSquares = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .collect(Collectors.toList());

        int sum = numbers.stream().reduce(0, Integer::sum);

        System.out.println("Even Squares: " + evenSquares);
        System.out.println("Sum: " + sum);
    }
}
