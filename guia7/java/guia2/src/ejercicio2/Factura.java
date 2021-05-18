package ejercicio2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;
import java.util.Arrays;

public class Factura {

    private UUID uuid;/// random for id
    private double totalAmount;
    private LocalDateTime date;
    DateTimeFormatter formatterOfPatters= DateTimeFormatter.ofPattern(" d/M/u  h:m a");
    private Client  client;
    private ItemSale[] itemSale;

    public Factura(double totalAmount, LocalDateTime date, Client client, ItemSale[] itemSale) {/// constructor
        this.uuid=UUID.randomUUID();
        this.totalAmount=totalAmount;
        this.date= LocalDateTime.now(); // now() is  current date

        this.client= client;
        this.itemSale= itemSale;
    }

    //GETTERS and SETTERS


    public UUID getUuid() {
        return uuid;
    }
    public double getTotalAmount(){
        return totalAmount;
    }

    public LocalDateTime getDate(){
        return date;
    }

    public Client getClient() {
        return client;
    }

    public ItemSale[] getItemSale(){
        return  itemSale;
    }

    public double finalPrice(){
        return ((totalAmount- (client.getDescuento()*getTotalAmount())/100));
    }

    /*public double getFinalPriceItem() {
        for (ItemSale itemSale : itemSale) {
            if (itemSale != null) {
                final=itemSale.;
            }
        }
        return;
    }*/
    @Override
    public String toString() {
        return "\n ID FACT: " + this.uuid +
                "\n Date:"+ this.date.format(formatterOfPatters)+
                "\n Client" + this.client +
                "\n TotalAmount: $" + this.totalAmount +
                "\n TotalDesc: $" + finalPrice() +
                "\n Items: " + Arrays.toString(itemSale) ;
}
    /*public String printMessagge() {
        StringBuilder items = new StringBuilder(10);   /// create a new objetc
        for (ItemSale itemsale : itemSale) { /// for each: clase o tipo de dato, : significa dentro de,
            if (itemsale != null) { // while itemsale is
                items.append(itemsale.getUuid());
                items.append("");
                items.append(itemsale.getProduct());
                items.append("");
                items.append(itemsale.getDescription());
                items.append("");
                items.append(itemsale.getUnitPrice());
                items.append(",");

            }
            return "\n ID Product: " + this.uuid + "\n Product: " + +"\n Description: " + this.description + "\n Unit Price: " + this.unitPrice;

        }
    }*/

}
