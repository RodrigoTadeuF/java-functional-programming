package functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {
        int increment = increment(1);
        System.out.println(increment);

        int increment2 = incrementByOneFunction.apply(1);
        System.out.println(increment2);

        int increment3 = multiplyByTenFunction.apply(1);
        System.out.println(increment3);

        int increment4 = incrementAndThenMultiplyFunction.apply(1);
        System.out.println(increment4);

        int increment5 = incrementAndMultiplyBiFuntion.apply(1, 10);
        System.out.println(increment5);


    }

    static Function<Integer, Integer> incrementByOneFunction = number -> number+1;
    static Function<Integer, Integer> multiplyByTenFunction = number -> number*10;
    static Function <Integer, Integer> incrementAndThenMultiplyFunction = incrementByOneFunction.andThen(multiplyByTenFunction);

    static BiFunction<Integer, Integer, Integer> incrementAndMultiplyBiFuntion = (number, multiplier) -> (number + 1) * multiplier;

    static int increment(int number) {
        return number + 1;
    }

    static int incrementAndMultiply(int number, int multiplier) {
        return (number + 1) * multiplier;
    }

}
