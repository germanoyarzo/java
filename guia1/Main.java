package com.Oyarzo;
import java.text.SimpleDateFormat;
import com.Oyarzo.ejercicio1.Rectangulo;
import ejercicio2.Empleado;
import ejercicio3.Ventas;
import ejercicio4.CuentaBanco;
import ejercicio5.Hora;

import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Rectangulo rect= new Rectangulo();

        ///b. Imprimir por pantalla el alto y ancho.
        System.out.println(rect);/// utilizando el mensaje de @override to string
       // System.out.println("Ancho " + rect.getWidth()); //get se utiliza para mostrar un atributo privado
        //System.out.println("Alto " + rect.getHeight());

        System.out.println("Area: " + rect.getArea());
        System.out.println("Perimetro: " + rect.getPerimetro());

        //d. Modificar el alto y el ancho de la instancia.
        rect.setHeight(2.0F);
        rect.setWidth(1.5F);
        System.out.println(rect);

        //e. Imprimir por pantalla nuevamente el cálculo del área y perímetro.
        System.out.println("Area: " + rect.getArea());
        System.out.println("Perimetro: " + rect.getPerimetro());

        //f. Inicializar un objeto Rectángulo con los valores por defecto y verificar.
        Rectangulo rectDefault= new Rectangulo(); /// devuelve el valor al original establecido al principio
        System.out.println("\n Altura: " + rectDefault.getHeight());
        System.out.println("\n Ancho: " + rectDefault.getWidth());


        ///-----------------------------------------------EJERCICIO 2 -----------------------------------
       /* Empleado empleado1= new Empleado(23456345, "Carlos","Gutierrez",25000);
        System.out.println(empleado1);// utilizamos Override
        System.out.print(" Salario Anual: $"+ empleado1.getSalarioAnual());

        Empleado empleado2= new Empleado(34234123, "Ana", "Gutierrez", 27500);
        System.out.println(empleado2);//utilizamos Override

        //d. Aumente el salario del empleado Carlos en un 15% e imprima en pantalla el
        //salario anual del mismo.
        System.out.println("Salario Mensual con aumento de Carlos: "+ empleado1.getModificarSalario());
        System.out.println("Salario Anual Carlos: " + empleado1.salarioAnualIncrementado(12));*/


        ///--------------------------EJERCICIO 3-----------------------REVISAR----------------------------------------
       // Ventas producto= new Ventas(1, "Fruta", 3, 10, 10);///inicializacion
        //System.out.println(producto);// utilizamos override

        ///-----------------------------------------------EJERCICIO 4------------------------------------------------
        double deposito;


        /*CuentaBanco cuenta= new CuentaBanco(1, "Juan Pepe", 15000);
        System.out.println(cuenta);
        System.out.println("El monto a depositar es de: $"+ cuenta.credito(2500));
        System.out.println(cuenta);

        System.out.println("El monto de extraccion es de: $" + cuenta.debito(1500));
        System.out.println(cuenta);*/


        ///-----------------------------------------------EJERCICIO 5------------------------------------------------

       /* Hora hora =new Hora(22,10,59);// create a new object called Hora
        System.out.println(hora);

        hora.sumarSeg();
        System.out.println(hora);

        hora.restarSeg();
        System.out.println(hora);*/


    }
}
