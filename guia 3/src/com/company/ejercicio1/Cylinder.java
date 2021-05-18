package com.company.ejercicio1;

public class Cylinder extends Circle {
    private double height=1.0;



    public Cylinder(double radio, String color, double height) {
        super(radio, color);
        this.height=height;
    }

    /// GETTERS and SETTERS
    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height=height;
    }

    public double volume(){
        return super.area()*height;
    }


    @Override
    public String toString(){
        return super.toString()+
                "\n Radio: " +
                "\n Area: " +
                "\n Volume: " + volume();
    }

}
