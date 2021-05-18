package ejercicio2;

public class Student extends Person {
    private int yearIn;
    private double monthlyFee; /// cuota mensual
    private String carrer;

    public Student(int dni, String name, String lastName, String email, String adress, int yearIn, double monthlyFee, String carrer){
        super(dni,name, lastName, email, adress);
        this.yearIn=yearIn;
        this.monthlyFee=monthlyFee;
        this.carrer=carrer;
    }

    ///region GETTERS and SETTERS

    public int getYearIn() {
        return yearIn;
    }
    public double getMonthlyFee(){
        return monthlyFee;
    }
    public String getCarrer(){
        return carrer;
    }
    ///endregion

    @Override
    public String toString(){
        return  "\n Person: "+ super.toString()+
                "\n Year in: "+ this.yearIn +
                "\n Monthlyfee: $" + this.monthlyFee+
                "\n Carrer: " + this.carrer;
    }

}

