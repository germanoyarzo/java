package com.company;

import ejercicio1.Circle;
import ejercicio1.Cylinder;
import ejercicio2.Person;
import ejercicio2.Staff;
import ejercicio2.Student;
import ejercicio3.Circle2;
import ejercicio3.Figure;
import ejercicio3.Rectangle;
import ejercicio3.Square;

public class Main {

    public static void main(String[] args) {


        ///-----------------------------EJERCICIO 1------------------------------------------------------------

        ///1)Inicializar un Cilindro y debuguear analizando los constructores a los que va
        //llamando para inicializar la cadena de herencia. Imprimir por pantalla, el
        //radio del cilindro, la altura, el área de la base y el volumen.
        /*

        Cylinder cylinder= new Cylinder();
        System.out.println(cylinder);

        //2)Inicializar un segundo CIlindro esta vez especificando la altura y radio.
        //Imprimir por pantalla el radio, la altura, el área de la base y el volumen.

        Cylinder cylinder1= new Cylinder(2.0,2.5);
        System.out.println("Cylinder 2: "+ cylinder1);

        //Imprimir por pantalla el área y el volumen del cilindro
        System.out.println("Area Cylinder: "+ cylinder.area());
        System.out.println("Volumen Cylinder: " + cylinder.volume());
        */


        ///-----------------------------EJERCICIO 2------------------------------------------------------------

        //● Inicializar 4 estudiantes diferentes.
    /*
        Person Student= new Student(36384624,"German", "Oyarzo", "german_@gmail.com"," Colon 2144", 2010, 3000, "Programacion");
        Person Student1= new Student(30200202,"Julieta", "Maffioni", "juli_@gmail.com","Bolivar 2443", 2019, 3500, "Ingeniery");
        Person Student2= new Student(10438445,"Roberto", "Segundo", "robsegundo@gmail.com","Las heras 3444", 2018, 5000, "Contador");
        Person Student3= new Student(26994566,"Carlos", "Figueroa", "carlos_mdq@gmail.com"," Mitre 2333", 2015, 2000,"Lawyer");


        //● Inicializar 4 miembros de staff con características diferentes.
        Person Staff = new Staff(4909049,"Juan", "Pepito", "sapopepe@gmail", "San juan 2299", 50000, "morning");
        Person Staff1 = new Staff(5565656,"Jose", "Gutierrez", "guti@gmail", "Jujuy 4949", 45000, "afternoon");
        Person Staff2 = new Staff(1929299,"Pedro", "Lopez", "pedro@gmail", "San Lorenzo 1234", 40000, "morning");
        Person Staff3 = new Staff(1234556,"Ignacio", "Gonzalez", "igngonza@gmail", "Brandesn 5556", 30000, "night");

        //● Crear un array que permita almacenar juntos los tipos anteriores y
        //almacenar las 8 instancias creadas anteriormente.

        Person [] studentAndStaff= new Person[8];
        studentAndStaff[0]=Student;
        studentAndStaff[1]=Student1;
        studentAndStaff[2]=Student2;
        studentAndStaff[3]=Student3;
        studentAndStaff[4]=Staff;
        studentAndStaff[5]=Staff1;
        studentAndStaff[6]=Staff2;
        studentAndStaff[7]=Staff3;

        int e=0; //cont studient
        int s=0; // cont staff

        for(Person person: studentAndStaff){
            if(person != null){
                if(person instanceof Student) e++; // if student is a class of person we ++
                if(person instanceof Staff) s++;
            }
        }
        System.out.println("Student: "+ e + " Staff: " + s );

        //● Recorrer el array y sumar el total de ingresos que percibe la
        //institución por parte de la cuota de estudiantes.

          double suma=0;


        for(Person person: studentAndStaff){
            if(person != null){// si los subindices del arreglo no estan vacio
                if(person instanceof Student) suma= suma + ((ejercicio2.Student) person).getMonthlyFee();
            }
        }
        System.out.println("Total income is: $" + suma);

        */

        ///-----------------------------EJERCICIO 3------------------------------------------------------------

        //Figure figure= new Figure(); /// NO SE PUEDE INSTANCIAR porque figure es una clase ABSTRACTA
        Figure circle= new Circle2("red", 1.5);
        System.out.println(circle);

        Figure rectangle= new Rectangle("Blue", 2,4);
        System.out.println(rectangle);

        Figure square= new Square("Blue",3.0);
        System.out.println(square);

        Figure [] figures = new Figure[3]; /// array with 3 elements
        figures[0]= circle;
        figures[1]= rectangle;
        figures[2]= square;

        for (Figure : figures) {
            if (figures != null) {
                System.out.println("El area de la figura " + figures.getClass().getSimpleName() + " es " + figures.calcularArea());
                System.out.println("El perimetro de la figura " + figures.getClass().getSimpleName() + " es " + figures.calcularPerimetro() + "\n");
            }



    }
}
