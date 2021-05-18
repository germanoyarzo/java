package ejercicio1;


/// this is the SUPER CLASS or father
public class Circle {
    private double radio=1.0;
    private String color= "red";


    ///create a constructor void
    public Circle(){
    }
    /// atribut that will be in other class
    public Circle(double radio){
        this.radio=radio;
    }

    public Circle(double radio, String color){
        this.radio=radio;
        this.color=color;

    }


 /// region GETTERS and SETTERS


    public double getRadio() {
        return radio;
    }

    public String getColor() {
        return color;
    }



    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void setColor(String color) {
        this.color = color;
    }


    /// endregion

    public double area() {
        return Math.PI*(Math.pow(radio,2));
    }

    @Override
    public String toString(){
        return "Circle"+
                "\n radio: "+this.radio+
                "\n color: " + this.color;

    }

}


