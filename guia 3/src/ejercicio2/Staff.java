package ejercicio2;

public class Staff extends Person{
    private double salary;
    private String workShift; // turno : morning, afternoon, nigth

    public Staff(int dni, String name, String lastName, String email, String adress, double salary, String workShift) {
        super(dni, name, lastName, email, adress);
        this.salary = salary;
        this.workShift = workShift;
    }

    /// region GETTERS and SETTERS

    public double getSalary() {
        return salary;
    }

    public String getWorkShift() {
        return workShift;
    }

    /// endregion

    @Override
    public String toString(){
        return "\n Staff: " + super.toString()+
                "\n Salary: $" + this.salary+
                "\n Work shift: " + this.workShift;
    }


}
