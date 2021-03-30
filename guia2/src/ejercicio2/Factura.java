package ejercicio2;

import java.time.LocalDate;
import java.util.UUID;
import java.util.Arrays;

public class Factura {

    private UUID uuid;
    private float totalAmount;
    private LocalDate date;
    private Client [] clients;

    public Factura(float totalAmount, LocalDate date, Client [] clients) {/// constructor
        this.uuid=UUID.randomUUID();
        this.totalAmount=totalAmount;
        this.date= LocalDate.now(); // now() is  current date
        this.clients= clients;
    }

    //GETTERS and SETTERS


  /*  public UUID getUuid() {
        return uuid;
    }
    public int getTotalAmount(){
        return totalAmount;
    }
    public LocalDate getDate(){
        return date;
    }

    public Client[] getClients() {
        return clients;
    }

public void totalAmount(float totalAmount){
        totalAmount=


}*/

}
