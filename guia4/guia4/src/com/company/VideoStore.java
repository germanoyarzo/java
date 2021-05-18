package com.company;

import java.time.LocalDate;

public class VideoStore {
    private Movie[] movies;
    private Client[] clients;
    private Rent[] rents;

    public VideoStore(Movie[] movies, Client[] clients) {
        this.movies = movies;
        this.clients = clients;
        this.rents = new Rent[50];
    }

    ///region Getters
    public Movie[] getMovies() {
        return movies;
    }

    public Client[] getClients() {
        return clients;
    }

    public Rent[] getRents() {
        return rents;
    }
    /// endregion

    ///● Quiere una forma de poder consultar los alquileres vigentes.

    public Movie searchMovie(String title) {
        for (Movie movie : movies) {
            if (movie != null && movie.getTittle().equals(title)) {/// compare the class movie with the title of the function
                return movie;
            }
        }
        return null; /// if doesnt exist return null
    }

    public Client searchClient(String name) {
        for (Client client : clients) {
            if (client != null && client.getName().equals(name)) {
                return client;
            }
        }
        return null;
    }
    public Rent searRent(int id){
        for(Rent rent: rents){
            if(rent != null && rent.getId() == id){
                return rent;
            }

        }
        return  null;
    }

    public void eliminateRent(int id){
        for(int i=0; i<rents.length; i++){
            if(rents[i] !=null && rents[i].getId() == id){
                rents[i]=null;
                break;
            }
        }
    }

    public String newClient(String name, String celphone, String direction){
       Client client= new Client(name, celphone, direction);
       for(int i=0; i< clients.length; i++){
           if(clients[i]!=null){
               clients[i]=client;
               break;
           }
       }
     return client.toString();
    }

    public Rent rentTittle(String title, String nameClient){
        Movie movie= searchMovie(title); ///
        Client client= searchClient(nameClient);
        if(movie !=null && client !=null){
            movie.setStock(movie.getStock()-1);
            Rent rent = new Rent(movie, client, LocalDate.now());

            for(int i=0; i<rents.length; i++){
                if(rents[i]== null){
                    rents[i]=rent;
                    break;
                }

            }
            return rent;
        }
        return null;
    }

    public void devolutionMovie(int rentId){
        Rent rent = searRent(rentId);
        if(rent != null){
            String movieName= rent.getMovie().getTittle();
            Movie movie= searchMovie(movieName);
            movie.setStock(movie.getStock()+1);
            eliminateRent(rentId);
        }

    }

    








    ///● Quiere una forma de poder consultar las devoluciones que deberían hacerse en el dia de la fecha.

    public Rent consultDevolutions(LocalDate date) {
        for (Rent rent : rents) {
            if (rent != null && rent.getDevolution().equals(date)) {
                return rent;
            }
        }
        return null;
    }

    ///TODO
    ///● Quiere poder consultar los últimos 10 alquileres de cada cliente.
    int i = 0;

    public Rent last10Rents(Client client) {
        for (Rent rent : rents) {
            if (rent != null && rents.length < 10) {
                return rent;
            }
        }
        return null;
    }

    ///TODO
    ///● Quiere una forma de consultar los títulos que fueron más alquilados.





    ///TODO
    ///● También quiere poder buscar títulos por género y ordenarlos según popularidad.



}


