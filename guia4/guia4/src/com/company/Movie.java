package com.company;
import java.time.LocalDate;

public class Movie {

    private String tittle;
    private Genero genero;
    private LocalDate fechaLanzamiento;
    private  String duration;
    private Clasification clasification;
    private String country;
    private String description;
    private int stock;


    public Movie(String tittle, Genero genero, LocalDate fechaLanzamiento, String duration, Clasification clasification, String country, String description, int stock) {
        this.tittle = tittle;
        this.genero=genero;
        this.fechaLanzamiento = fechaLanzamiento;
        this.duration = duration;
        this.clasification = clasification;
        this.country = country;
        this.description = description;
        this.stock = stock;
    }


    /// region Getters
    public String getTittle() {
        return tittle;
    }
    public Genero getGenero(){
        return genero;
    }

    public LocalDate getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public String getDuration() {
        return duration;
    }

    public Clasification getClasifacation() {
        return clasification;
    }

    public String getCountry() {
        return country;
    }

    public String getDescription() {
        return description;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

/// endregion




    @Override
    public String toString() {
        return "\n Tittle: "+ this.tittle+
                "\n Genero: "+ genero+
                "\n Fecha de lanzamiento: "+ fechaLanzamiento+
                "\n Duration: " + this.duration +
                "\n Clasification: "+ clasification +
                "\n Country:  "+ this.country+
                "\n Description: "+ this.description;
    }
}
