package ejercicio3;

public class Circle2 extends Figure {

    private double radius=1.0;

    public Circle2(){

    }
    public Circle2(String color, double radius){
        super(color);
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    ///region ABSTRACTS METHODS
    @Override
    public double area(){
        return (Math.PI * (Math.pow(radius,2)));
    }

    @Override
    public double perimeter(){
        return ( 2* (Math.PI * this.radius));
    }
    /// endregion


    @Override
    public String toString(){
     return "\n Circle " +
             "\n Radius: " + this.radius +
             "\n Area: " + area() +
             "\n Perimeter: " + perimeter();
    }

}
