package com.company;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        /*Scanner scanner= new Scanner(System.in);
        System.out.println("ingrese un numero");
        System.out.println("EL numero ingresado es: "+scanner.nextInt());*/



        Person person1=new Person();
        Person person2= new Person("jose", 30, 'h');
        Person person= new Person("german", 29, 0,'m', 65, 1.73) ;

        HashMap <Integer, Person> listHash = new HashMap<Integer, Person>();
        listHash.put(person1.hashCode(),person1); /// introduce dates into person 1
        listHash.put(person2.hashCode(), person2);
        listHash.put(person.hashCode(),person);

        for(Map.Entry <Integer, Person> entry: listHash.entrySet()){ /// adquirimos el valor de la persona en la posicion
            Person personValue= entry.getValue();;
            System.out.println(personValue);
            System.out.println(personValue.calcularIMC());

        }


    }
}
