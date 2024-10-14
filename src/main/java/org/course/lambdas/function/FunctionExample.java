package org.course.lambdas.function;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        /*
        * FUNCTION
        * Recibe un valor y retorna un resultado.
        * */

        Function<Integer, String> function = (num) -> "El numero es: " + num;
        String result = function.apply(5);
        System.out.println(result);
    }
}
