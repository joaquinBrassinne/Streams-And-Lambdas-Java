package org.course.lambdas.suplier;

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        /*
        * Supplier
        * No recibe ningun valor pero retorna un resultado
        * */

        Supplier<String> supplier = () -> "Hola soy un supplier";

        String result = supplier.get();
        System.out.println(result);
    }
}
