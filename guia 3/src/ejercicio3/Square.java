package ejercicio3;

import java.rmi.MarshalledObject;

public class Square extends Rectangle{


    public Square(){
        super();/// init empty to refer rectangle`s atributties
    }

    public Square(String color, double width){
        super(color, width, width);

    }

    @Override
    public double area(){
        return (Math.pow(super.getWidth(),2));
    }
    @Override
    public double perimeter(){
        return (super.getWidth() + super.getWidth() + super.getWidth() + super.getWidth());
    }

    @Override
    public String toString(){
        return "\n Square: "+
                "\n Width: " + super.getWidth()+
                "\n Area: " + area()+
                "\n Perimeter: " + perimeter();
    }
}
