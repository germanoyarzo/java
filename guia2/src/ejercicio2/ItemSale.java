package ejercicio2;

import java.util.UUID;

public class ItemSale {

    private UUID uuid; ///random type
    private String product;
    private String description;
    private double unitPrice;

    public ItemSale(String product, String description, double unitPrice){///Constructor
        this.uuid= UUID.randomUUID();// random
        this.product=product;
        this.description=description;
        this.unitPrice=unitPrice;
    }

    //region GETTERS AND SETTERS
    public UUID getUuid(){
        return uuid;
    }
    public void setUuid(UUID uuid){
        this.uuid=uuid;
    }
    public String getProduct(){
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getDescription(){
        return description;
    }
    public double getUnitPrice(){
        return unitPrice;
    }
    // endregion


@Override /// show
    public String toString(){
        return "\n ID Product: "+ uuid+ "\n Product: "+ product+ "\n Description: "+ description+ "\n Unit Price: $"+ unitPrice;
}



}
