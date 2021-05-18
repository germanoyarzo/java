package com.company;

import java.util.Scanner;
import java.util.Random;
import java.io.IOException;
import java.util.InputMismatchException;

public class Main {

    public static void main(String[] args) {
       /* 1. ¿Qué está mal en la siguiente bloque de código?
        try
        {
            Persona p = baseDeDatos.buscar(datos);
            System.out.println(“Los datos pertenecen a: ” + p);
        }
        catch(Exception e) {
        // Maneja cualquiera de las excepciones comprobadas
        }
        catch(RuntimeException e) { /// es mala practica agarrar una exception que es por un error del programador, unchecked
            // por ejemeplo que se declare un array con mas elementos de lo que tiene permitido.
        // Maneja cualquiera de las excepciones no comprobadas
        }*/

        ///3 Escribe un programa que juegue con el usuario a adivinar un número. El
        //ordenador debe generar un número entre 1 y 500, y el usuario tiene que intentar
        //adivinarlo.

       //randomNumber();
        adivinarNumber();



    }

   public static int randomNumber()
    {
        Random number= new Random();
        int x=1+number.nextInt(3); // number between 1 and 500

        return  x;

    }

    public static void adivinarNumber(){
        Scanner scanner= new Scanner(System.in);
        int x=0;



        try {
            System.out.println("Ingrese el numero que considere que va a salir");
            x=scanner.nextInt();
            System.out.println("numero elegido "+ x);

            System.out.println("El numero aleatorio es: " + randomNumber());
            if (x > randomNumber()) {
                scanner.reset();
                System.out.println("el numero aleatorio es menor al ingresado");
                adivinarNumber();

            } else if (x < randomNumber()) {
                scanner.reset();
                System.out.println("el numero aleatorio es mayor al ingresado");
               adivinarNumber();
            } else {

                System.out.println("ADIVINASTE: el numero aleatorio es igual al ingresado");
            }

        }catch (InputMismatchException e)
        {
            System.out.println("INVALIDO: tenias que ingresar un numero");
            adivinarNumber();
        }
        finally {
            System.out.println("programa terminado");
        }
    }
 /*   public static int cuentaIntentos(){
       int contador=0;
        while(contador)
        {
            adivinarNumber();
        }
        return i;
    }*/

}

