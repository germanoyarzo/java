package ejercicio2;

import java.time.LocalDate;
import java.util.UUID;
import java.util.Arrays;


public class Factura {

    private UUID uuid;
    private double totalAmount;
    private LocalDate date;
    private Client clients;
    private ItemVenta [] itemventas;


    public Factura(double totalAmount, LocalDate date, Client clients) {/// constructor
        this.uuid = UUID.randomUUID();
        this.totalAmount = totalAmount;
        this.date = LocalDate.now(); // now() is  current date
        this.clients = clients;
    }

    //GETTERS and SETTERS


    public UUID getUuid() {
        return uuid;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public LocalDate getDate() {
        return date;
    }

    public Client getClients() {
        return clients;
    }


    @Override
    public String toString() {
        return "\n ID FACT: " + this.uuid + "\n Date:"+ this.date+ "\n Client" + this.clients + "\n TotalAmount: $" + this.totalAmount +"\n TotalDesc: $"+ ((totalAmount- (clients.getDescuento()*getTotalAmount())/100));
    }
}


