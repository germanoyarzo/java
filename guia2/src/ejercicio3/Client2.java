package ejercicio3;
import java.util.UUID;

public class Client2 {
 private UUID uuid;
 private String name;
 private String sex;


    public Client2( String name, String sex) {
        this.uuid = UUID.randomUUID();
        this.name = name;
        this.sex = sex;
    }

    ///region GETTERS and SETTERS

    public UUID getUuid() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    /// endregion

    @Override ///el @  chequea si esta bien lo que se ingresa por parametro y sobreescribe el metodo toString
    public String toString(){
     return  "\n ID: "+ uuid.toString().substring(0, 10)+ /// reduce the id and convert to string
             "\n Name: " + this.name+
             "\n Sex: " + this.sex;
    }

}
