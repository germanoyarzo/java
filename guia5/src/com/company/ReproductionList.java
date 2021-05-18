package com.company;

public abstract  class ReproductionList implements Reproduction{

   private String name;

    public ReproductionList(String name) {
        this.name = name;
    }
    public ReproductionList(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
