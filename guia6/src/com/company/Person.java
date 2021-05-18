package com.company;


import java.util.Objects;

public class Person {


    private String name;
    private int age;
    private int dni;
    static final char man='h';
    static final char women='m';
    private char sex;
    private double weigth;
    private double heigth;

    public Person() {
        this.name = "";
        this.age = 0;
        this.generaDni();
        this.sex=man;
        this.weigth = 0.0;
        this.heigth = 0.0;

    }

    public Person(String name, int age, char sex) {
        this.name = "";
        this.age = 0;
        this.sex=man;
        this.weigth = 0.0;
        this.heigth = 0.0;
    }


    public Person(String name, int age, int dni, char sex, double weigth, double heigth) {
        this.name = "";
        this.age = 0;
        this.generaDni();
        this.sex=man;
        this.weigth = 0.0;
        this.heigth = 0.0;
    }

    ///region GETTERS and SETTERS


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDni() {
        return dni;
    }


    public void setSex(char sex){
        if(sex== man) {
            this.sex = sex;
        }
        else
        {
            this.sex=women;
        }
    }
    public double getWeigth() {
        return weigth;
    }

    public void setWeigth(double weigth) {
        this.weigth = weigth;
    }

    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    ///endregion


    int calcularIMC(){
        ///pesokg/(altura^2)
        double IMC=0.0;
        IMC=this.weigth/ this.heigth*2;
        if(IMC <20){
            return -1;///  peso ideal
        }
        if (IMC >= 20 || IMC <= 25)
        {
            return 0; /// debajo de peso ideal
        }
        else
        {
            return 1; /// sobrepeso
        }

    }

    public boolean esMayorDeEdad(int age){
        if(this.age>=18){
            return true;
        }
        else {
            return false;
        }

    }

    /// region EQUALS && HASHCODE
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && dni == person.dni && sex == person.sex && Double.compare(person.weigth, weigth) == 0 && Double.compare(person.heigth, heigth) == 0 && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, dni, sex, weigth, heigth);
    }

    ///endregion


    public void generaDni(){
        this.dni= (int)(Math.random()*50000000+1);
    }
    @Override
    public String toString() {
        return "\n Name: "+ this.name+
                "\n Age: "+this.age +
                "\n DNI: " + this.dni +
                "\n Sex: " + this.sex+
                "\n Weidth: " + this.weigth+
                "\n Heigth: " + this.heigth;
    }
}
