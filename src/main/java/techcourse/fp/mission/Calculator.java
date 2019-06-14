package techcourse.fp.mission;

import java.util.List;

public class Calculator {
    public static int sum(List<Integer> numbers, Conditional<Integer> c) {
        int total = 0;
        for (int number : numbers) {
            if (c.test(number)) {
                total += number;
            }
        }
        return total;
    }

    public static int sumAll(List<Integer> numbers, Conditional<Integer> c) {
        return sum(numbers, c);
    }

    public static int sumAllEven(List<Integer> numbers, Conditional<Integer> c) {
        return sum(numbers, c);
    }

    public static int sumAllOverThree(List<Integer> numbers, Conditional<Integer> c) {
        //TODO: List에 담긴 값 중 3보다 큰 수만을 더해야 한다.
        return sum(numbers, c);
    }
}
