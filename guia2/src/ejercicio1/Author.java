package ejercicio1;

public class Author {

    private String name;
    private String lastname;
    private String email;
    private String genero;

    public Author(String name, String lastname, String email, String genero){// CONSTRUCTOR CON PARAMETRO
        this.name=name;
        this.lastname=lastname;
        this.email=email;
        this.genero=genero;
    }


//getters y setters
    public String getName(){return  name;}
    public String getLastname(){return lastname;}
    public String getEmail(){return email;}
    public String getGenero(){return genero;}


@Override /// metodo para mostrar los datos de la clase
    public String toString(){
        return "\n Name: "+ this.name + "\n Lastname: "+ this.lastname+ "\n email: "+ this.email+ "\n Genero: "+ this.genero;

    }
}
