package org.course.lambdas.unaryOperator;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
    public static void main(String[] args) {
        /*
        * UnaryOperator
        *
        * Recibe un valor, lo procesa
        * y devuelve un resultado del mismo tipo
        * */

        UnaryOperator<Integer> unaryOperator = (number) -> number * number;


        int result = unaryOperator.apply(5);
        System.out.println(result);
    }
}
