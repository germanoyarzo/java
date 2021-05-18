package com.company;
import java.time.LocalDate;
import java.util.UUID;

public class Rent {

    public static int i=1;

    private int id;
    private Movie movie;
    private Client client;
    private LocalDate loan;
    private LocalDate devolution;

    public Rent(Movie movie, Client client, LocalDate loan) {
        this.id= i++;
        this.movie = movie;
        this.client = client;
        this.loan = loan;
        this.devolution = devolution.plusDays(2); /// add 2 days after de loan
    }

    /// region GETTERS



    public int getId()
    {
        return id;
    }

    public Movie getMovie() {
        return movie;
    }

    public Client getClient() {
        return client;
    }

    public LocalDate getLoan() {
        return loan;
    }

    public LocalDate getDevolution() {
        return devolution;
    }

    ///endregion

    @Override /// metodh to show
    public String toString(){
        return "\n Rent: " +
                "\n id: "+ this.id+
                "\n Movie: "+ this.movie+
                "\n Client: : "+ this.client+
                "\n Loan "+ this.loan+
                "\n Devolution "+ this.devolution;
    }


}
