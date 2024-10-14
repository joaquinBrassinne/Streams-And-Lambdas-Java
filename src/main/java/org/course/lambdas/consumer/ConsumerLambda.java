package org.course.lambdas.consumer;

import java.util.function.Consumer;

public class ConsumerLambda {
    public static void main(String[] args) {
        /*CONSUMER
        * recibe un valor y no retorna nada
        * */

        ///Consumer<String> consumer = (param) -> System.out.println(param);
        Consumer<String> consumer =  System.out::println;


        consumer.accept("Joaquin");
    }
}