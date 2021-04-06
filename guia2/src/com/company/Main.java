package com.company;
import java.io.PrintStream;
import ejercicio1.Libro;
import ejercicio1.Author;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Scanner;
import ejercicio2.Client;
import ejercicio2.Factura;
import java.time.LocalDate; /// library for date
import java.time.format.DateTimeFormatter;
import ejercicio2.ItemSale;
import ejercicio3.Account;
import ejercicio3.Client2;



public class Main {


    public static void main(String[] args) {



        /*Author Joshua= new Author("Joshua", "Bloch","joshua@email.com", "M");///create a new object
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
        //“El libro, {título} de {nombre del autor}. Se vende a {precio} pesos.”
        System.out.println(libro.printMessagge());

        ///-------------------------------EJERCICIO 2---------------------------------------------------------

        //b. Cree un objeto de tipo Cliente, imprima sus detalles por pantalla.
        Client cliente= new Client("German Oyarzo", "german_@gmail.com", 10);// create a new object
        System.out.println(cliente);

        /// create a new format with patron
       /// LocalDateTime date= LocalDateTime.now();
        //DateTimeFormatter formatterOfPatters= DateTimeFormatter.ofPattern(" d/M/u  h:m a");
        ///System.out.println(date.format(formatterOfPatters));

        /// convert a string to date

        String dateLikeString="12/02/1985";
        LocalDate date= LocalDate.parse(dateLikeString,DateTimeFormatter.ofPattern("dd/MM/y"));
        System.out.println(date.format(DateTimeFormatter.ofPattern("dd/MM/y")));


        ///c. Cree un objeto de tipo Factura que posea al Cliente anteriormente creado.
        //Una vez hecho esto, imprima por pantalla el monto total de esta Factura y el
        //monto total luego de aplicarle el descuento
       // Factura factura= new Factura(100, LocalDate.now(), cliente);
        ///System.out.print("El monto total con descuento es: "+((factura.getTotalAmount()-((cliente.getDescuento()* factura.getTotalAmount())/100))));
       // System.out.println(factura);



        ///e. Analizar de agregar el tipo ItemVenta, que representa un producto que
        //forma parte de la venta. El mismo contiene un id, un nombre, descripción y
        //precio unitario. Considere las modificaciones necesarias en el tipo Factura
        //para que el mismo pueda almacenar múltiples Ítems de venta y a su vez
        //calcular los montos totales con y sin el descuento aplicado.
        /*ItemSale item1=new ItemSale ("Fruit", "Apple",150);
        ItemSale item2= new ItemSale("Fruit", "Orange", 100);


        ItemSale [] items= new ItemSale[2]; // create an array with itemSales
        items[0]=item1;
        items[1]=item2;

        Factura factura= new Factura(100,date,cliente,items);
        System.out.println(factura);


        */

        ///-------------------------------EJERCICIO 3---------------------------------------------------------

        ///a. Crear un Cliente e imprimirlo en pantalla

        Client2 client=new Client2("German Oyarzo", "M");
        System.out.println(client);

        ///b. Crear una Cuenta bancaria para el Cliente anterior con un saldo inicial de 10000.
        Account account=new Account(10000, client);
        System.out.println(account);

        ///c. Realizar operaciones de depósito y extracción para probar esa funcionalidad.
        System.out.println("Account with deposit: $"+ account.deposit(5000));
        System.out.println("Account with extraction: $"+ account.extraction(1000));
        System.out.println("Account with extraction: $"+ account.extraction(2000));
        System.out.println("Account with extraction: $"+ account.extraction(3000));










    }
}
