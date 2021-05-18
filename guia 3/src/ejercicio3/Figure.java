package ejercicio3;

public abstract class Figure {

    private String color="Red";

    public Figure(){
    }
    public Figure(String color){
        this.color=color;
    }

    public String getColor(){
        return  this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double area();
    public abstract double perimeter();


    @Override
    public String toString(){
        return "\n Color: " + this.color;
    }

}
