package ejercicio1;

public class Cylinder extends Circle {
    private double height=1.0;

    public Cylinder(){
     /// init in 0 if constructor is void
     super();
    }
    public Cylinder(double radio, String color){
        super(radio, color);
    }


    public Cylinder(double radio,  double height) {
        super(radio);
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
    public double area(){
        ///(2π×radius×height + 2×areaBase)
        return ((Math.PI*2*super.getRadio()*this.height) + (2*super.area()));
    }



    @Override
    public String toString(){
        return "Cylinder{"+
                "\n SubClass of : "+ super.toString() +
                "\n Heigth: " + this.height + "\n Volume: " + volume();

    }

}
