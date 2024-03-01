package task1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class NumbersValidation {
    public static void main(String[] args) {
        IntStream intsStream = IntStream.range(1, 200);
        List<Integer> numbers = new ArrayList<>();
        intsStream
                .filter(value -> value % 3 == 0)
                .forEach(value-> numbers.add(value));
        System.out.println(numbers);
    }
}
