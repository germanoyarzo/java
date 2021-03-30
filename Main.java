package com.company;
import java.io.PrintStream;
import ejercicio1.Libro;
import ejercicio1.Author;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;
import ejercicio2.Client;
import ejercicio2.Factura;

public class Main {


    public static void main(String[] args) {



        Author Joshua= new Author("Joshua", "Bloch","joshua@email.com", "M");///create a new object
        System.out.println(Joshua);

        //b. Imprima por pantalla al autor previamente instanciado.
        Author []Authors= new Author[2]; //create a new array authors with 3 authors
        Authors[0]=Joshua; // Joshua is in the  possition 0 in the array

        //c. Inicialice el libro “Effective Java” del Autor “Joshua Bloch” que cuesta 450
        //pesos con una cantidad de 150 copias.

        Libro libro= new Libro("Effective Java",450, 150, Authors);
        System.out.println(libro); //Imprima por pantalla el libro instanciado.

        //e. Modifique el precio del libro “Effective Java” a 500 pesos y aumente la
        //cantidad en 50 copias.
        libro.setPrice(500);
        libro.setStock(libro.getStock()+50);
        System.out.println("\n Modificacion: " +libro);

        //f. Imprima por pantalla los atributos del Autor Joshua, accediendo desde el Libro “Effective Java”.
        System.out.println(Arrays.toString(libro.getAuthors()));


        ///g. Agregue un método a la clase Libro que posibilite imprimir en pantalla el
        //siguiente mensaje:
        ///“El libro, {título} de {nombre del autor}. Se vende a {precio} pesos.”
        System.out.println(libro.printMessagge());

        ///-------------------------------EJERCICIO 2---------------------------------------------------------

        //b. Cree un objeto de tipo Cliente, imprima sus detalles por pantalla.
        Client cliente= new Client("German Oyarzo", "german_@gmail.com", 10);// create a new object
        System.out.println(cliente);

        ///c. Cree un objeto de tipo Factura que posea al Cliente anteriormente creado.
        //Una vez hecho esto, imprima por pantalla el monto total de esta Factura y el
        //monto total luego de aplicarle el descuento
        Factura factura= new Factura(100, LocalDate.now(), cliente);
        System.out.print("El monto total con descuento es: "+((factura.getTotalAmount()-((cliente.getDescuento()* factura.getTotalAmount())/100))));









    }
}
