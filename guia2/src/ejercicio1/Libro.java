package ejercicio1;

import java.util.Arrays;

public class Libro {

    ///1. Es necesario modelar el objeto de tipo Libro con las siguientes caracteristicas, titulo,
    //precio, stock y Autor, este último posee las características de nombre, apellido,
    //email y genero ( ‘M’ o ‘F’ ). Para este ejercicio vamos a asumir que un libro tiene un
    //único autor

    private String tittle;
    private int price;
    private int stock;
    private Author author;
    private Author[] Authors;


    public Libro(String tittle, int price, int stock, Author [] Author){///METODO CONSTRUCTOR
        this.tittle=tittle;
        this.price=price;
        this.stock=stock;
        this.Authors=Author;
    }

    ///GETTERS and SETTERS
    public String getTittle(){
        return tittle;}
    public int getPrice(){
        return price;}
    public void setPrice(int price){
        this.price=price;
    }

    public int getStock(){
        return stock;}

        public void setStock(int stock){
        this.stock=stock;
        }

    public Author[] getAuthors() {
        return Authors;
    }

    public void setAuthor(Author [] Authors){
        this.Authors=Authors;
    }

    ///g. Agregue un método a la clase Libro que posibilite imprimir en pantalla el
    //siguiente mensaje:
    //“El libro, {título} de {nombre del autor}. Se vende a {precio} pesos.”

    public String printMessagge(){
        StringBuilder names= new StringBuilder(10); // for each: los datos son mutables. capicity es la cantidad

        for(Author author: Authors){ /// for each: el : signigica (DENTRO DE) tipo de dato (Arreglo de autor)  y variable con nombre variable
            if(author != null){/// si el subindice del arreglo esta vacio, no contiene nada  se pone que sea distinto de null para que no muestre 0 o vacio
            names.append(author.getName());
            names.append("");
            names.append(author.getLastname());
            names.append(",");

        }


    }
        return "\n The book"+ this.tittle+ " of "+ names + " is selling for: "+this.price+" pesos";
    }

    @Override ///metodo para mostrar los datos de la clase
    public String toString(){
        return "\n Title: "+this.tittle+ "\n Price: $"+ this.price + "\n Stock: "+ this.stock+ "\n Author: "+ Arrays.toString(Authors);///show a complete arrays
    }
}
