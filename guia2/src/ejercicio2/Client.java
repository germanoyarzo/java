package ejercicio2;
import java.util.UUID;

public class Client {

    private UUID uuid;/// random type
    private String name;
    private String email;
    private float descuento;

    public Client( String name, String email, float descuento) {/// metodo constructor
        this.uuid =UUID.randomUUID();
        this.name = name;
        this.email = email;
        this.descuento = descuento;
    }


    ///getters and setters
    public UUID getUuid(){
        return uuid;
    }
    public String getName(){
        return  name;
    }
    public String getEmail(){
        return email;
    }
    public float getDescuento(){
        return descuento;
    }

@Override /// metodh to show
public String toString(){
        return "\n Cliente: " + "\n id: "+ this.uuid+"\n name: "+ this.name+ "\n email: "+ this.email+ "\n descuento: "+ this.descuento;
}


}
