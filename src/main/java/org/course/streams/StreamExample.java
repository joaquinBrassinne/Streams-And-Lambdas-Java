package org.course.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Pepito", "Juanito", "Martin", "Garrix", "Julien", "France");
        System.out.println("**************** filter() *********************");
        //  filter(): filtra los elementos que cumplen una condicion. UTILIZA EL METODO consumer()
        names.stream()
                .filter((name) -> name.length() > 4)
                .forEach(System.out::println);


        System.out.println("***************** map() *********************");
        //map() : Tranforma los elementos aplicando una funcion usando el metodo Function()!!
        names.stream()
                .map(String::toUpperCase) //(name) -> name.toUpperCase()
                .filter((name) -> name.startsWith("J"))
                .forEach(System.out::println);


        System.out.println("***************** sorted() *********************");
        //sorted() Ordena los elementos del stream.
        names.stream()
                .sorted() //En este caso ordena de manera alfabetica.
                .forEach(System.out::println);


        System.out.println("***************** forEach() *********************");
        //forEach() aplica una accion a cada elemento ya sea consultas a la base de datos y mas
        names.stream()
                .forEach(System.out::println);


        System.out.println("***************** reduce() *********************");
        //reduce() combina todos los elementos en un solo valor
        String name = names.stream()
                .reduce("resultado: ", (a, b) -> a + " " + b);
        System.out.println(name);


        System.out.println("***************** collect() *********************");
        //collect() recoge los elementos en una coleccion
        List<String> list = names.stream()
                .map((String::toUpperCase))
                .collect(Collectors.toList());

        list.stream()
                .forEach(System.out::println);


        List<String> namesDuplicated = Arrays.asList("Pepito", "Pepito","Pepito","Juanito", "Martin", "Garrix", "Julien", "France");
        System.out.println("***************** distinct() *********************");
        //Elimina los elementos duplicados en este caso Joaquin

        //Lista original
        namesDuplicated.stream().forEach((original) -> System.out.println("Lista con duplicados: " + original));
        System.out.println("");
        names.stream()
                .distinct()
                .forEach((noDuplicated) -> System.out.println("Sin duplicados: " + noDuplicated));



        System.out.println("***************** limit() *********************");
        //Limit() limita el numero de elementos procesados
        namesDuplicated.stream()
                .limit(3)            //Deberia traer 3 pepitos
                .forEach(System.out::println);



        System.out.println("***************** skip() *********************");
        //skip() omite un numero especifico de elemntos
        namesDuplicated.stream()
                .skip(3)  //Nos saltamos a los pepitos
                .forEach(System.out::println);



        System.out.println("***************** anyMatch() *********************");
        //anyMatch() verifica si algun elementos cumple alguna condicion

        boolean verificate = namesDuplicated.stream()
                .anyMatch(s -> s.startsWith("P"));
        System.out.println(verificate);



        System.out.println("***************** allMatch() *********************");
        //allMatch() verifica si todos los elementos cumplen una condicion
        boolean verificate2 = namesDuplicated.stream().allMatch(s -> s.startsWith("J"));
        System.out.println(verificate2);


        System.out.println("***************** noneMatch() *********************");
        //noneMatch() verifica si ningun elemento  cumple la condicion
        boolean resultado = namesDuplicated.stream()
                .noneMatch((namess) -> namess.length() == 10); //Retorna un false debido a que algunos elementos pasan
    }                                                          //los 10 caracteres

}
