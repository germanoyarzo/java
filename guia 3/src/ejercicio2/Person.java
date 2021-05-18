package ejercicio2;

public class Person {
    private int  dni;
    private String name;
    private String lastName;
    private String email;
    private String adress;


    public Person(int dni, String name, String lastName, String email, String adress){
        this.dni=dni;
        this.name=name;
        this.lastName=lastName;
        this.email=email;
        this.adress=adress;
    }

    /// region GETTERS and SETTERS


    public int getDni() {
        return dni;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getAdress() {
        return adress;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    /// endregion


    @Override
    public String toString(){
        return  "\n Dni: "+ this.dni+
                "\n Name: "+ this.name+
                "\n Lastname: " + this.lastName+
                "\n Email: " + this.email+
                "\n Adress: " + this.adress;
    }
}
