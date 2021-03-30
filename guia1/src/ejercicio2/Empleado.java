package ejercicio2;

public class Empleado {
    private int dni;
    private String name;
    private String lastName;
    private double salario;

    public Empleado(int dni, String name, String lastName, double salario){
        this.dni=dni;
        this.name=name;
        this.lastName=lastName;
        this.salario=salario;

    }


    public void setDni(int dni){//primero utilizamos el set
        this.dni= dni;
    }
    public int getDni(){
        return dni;
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return  name;
    }
    public void setLastName(String name){
        this.lastName=lastName;
    }
    public String getLastName(){
        return lastName;
    }

    public void setSalario(double salario){
        this.salario=salario;
    }
    public double getSalario(){
        return salario;
    }
    public double getSalarioAnual(){
        return this.salario*12;
    }
    public double getModificarSalario(){
        return this.salario*1.15;
    }
    public double salarioAnualIncrementado(double Meses){
        return this.getModificarSalario()*Meses;
    }



    @Override
    public String toString(){
        return "\n DNI: " + this.dni + "\n Nombre: " + this.name + "\n Apellido: " + this.lastName + "\n Salario: $" + this.salario;
    }


}
