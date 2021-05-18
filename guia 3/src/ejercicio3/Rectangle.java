package ejercicio3;

public class Rectangle extends Figure {

    private double high=1.0;
    private double width=1.0;

    public Rectangle(){

    }
    public Rectangle(String color,double high, double width){
        super(color);
        this.high=high;
        this.width= width;

    }
    ///  region GETTERS


    public double getHigh() {
        return high;
    }

    public double getWidth() {
        return width;
    }

    ///endregion

    ///region ABSTRACTS METHODS
    @Override
    public double area() {
         return (this.width * this.high);

    }

    @Override
    public double perimeter() {
        return ( 2*(this.width + this.high));

    }
    /// endregion




    @Override
    public String toString(){
        return "\n Rectangle "  +
                "\n High: " + this.high +
                "\n Width: " + this.width+
                "\n Area: " + area() +
                "\n Perimeter: " + perimeter();
    }


}
