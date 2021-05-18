package com.company;

import java.util.UUID;
public class Client {

    private UUID uuid;
    private String name;
    private String celphone;
    private String direction;

    public Client( String name, String celphone, String direction) {
        this.uuid = UUID.randomUUID();
        this.name = name;
        this.celphone = celphone;
        this.direction=direction;
    }

    /// region Getters
    public UUID getUuid() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public String getDirection() {
        return direction;
    }

    public String getCelphone() {
        return celphone;
    }
    /// endregion

    @Override /// metodh to show
    public String toString(){
        return "\n Cliente: "
                + "\n id: "+ this.uuid+
                "\n name: "+ this.name+
                "\n celphone "+ this.celphone+
                "\n Direction: : "+ this.direction;

    }
}
