package com.company;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        // write your code here

    /*Movie movie= new Movie("Titanic",Genero.Drama, LocalDate.of(1997,05,12), "02:45",Clasification.PG, "USA", "Is a true story");
        System.out.println(movie);*/
        Movie movies[] = new Movie[50];
        movies[0] = new Movie("Titanic", Genero.Drama, LocalDate.of(1997, 05, 12), "02:45", Clasification.PG, "USA", "Is a true story", 3);
        movies[1] = new Movie("Gladiator", Genero.Acción, LocalDate.of(2003, 11, 15), "02:30", Clasification.PG13, "USA", "Based on roman figthers", 1);

        Client clients[]= new Client[50];
        //clients[0]= new Client("German", "234545454", "Las heras");
        //clients[1]= new Client("Julieta", "114545454", "Bolivar ");


        VideoStore videoStores= new VideoStore(movies, clients);

        videoStores.newClient("German", "223518483", "Las heras");
        videoStores.newClient("Julieta", "223555555", "Jujuy");

        //printClients(videoStores);
        //printMovies(videoStores);


        System.out.println("Rent 1: \n");
        System.out.println(videoStores.rentTittle("Titanic", "German"));
        printRents(videoStores);

        System.out.println("Rent 2: \n");
        System.out.println(videoStores.rentTittle("Gladiator", "Julieta"));
        printRents(videoStores);

        printMovies(videoStores);

        videoStores.devolutionMovie(3);
        printRents(videoStores);
        printMovies(videoStores);











    }

    public static void printMovies(VideoStore videoStores){
        System.out.println("Movies: \n");
        for (Movie movie : videoStores.getMovies()) {
            if (movie != null) {
                System.out.println(movie);
            }
        }
    }

    public static void printClients(VideoStore videoStores){
        System.out.println("Clients \n");
        for(Client client: videoStores.getClients()){
            if(client !=null){
                System.out.println(client);
            }
        }
    }

    public static void printRents(VideoStore videoStore){
        System.out.println("Rents \n");
        for(Rent rents: videoStore.getRents()){
            if(rents !=null){
                System.out.println(rents);
            }
        }
    }
}
