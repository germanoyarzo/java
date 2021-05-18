package com.company;

public class Artist {
    private String name;
    private int age;
    private String nationality;

    public Artist(String name, int age, String nationality) {
        this.name = name;
        this.age = age;
        this.nationality = nationality;
    }

    /// region GETTERS

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getNationality() {
        return nationality;
    }
    /// endregion


    @Override
    public String toString() {
        return "\n Name: " + this.name+
                "\n Age: " + this.age+
                " \n Nationalaty: " + this.nationality;
    }
}

