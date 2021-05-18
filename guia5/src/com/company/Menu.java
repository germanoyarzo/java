package com.company;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;


public class Menu {

    List<Song> songs;

    ReproductionList myList;

    Scanner myScanner;

    public Menu(ReproductionList myList){
        this.songs= traerCanciones();
        this.myList=myList;
        this.myScanner= new Scanner(System.in);
    }

    public void menuSongs(){
        int option;

        do {

        System.out.println("Choose an option (0 to exit)");

        System.out.println("1: Play list");
        System.out.println("2: Watch my List");
        System.out.println("3: Add a song");
        System.out.println("4: Delete a song");

        option=myScanner.nextInt();

        switch (option) {
            case 1:
                play();
                break;
            case 2:
                myList.watchMyList();
                break;
            case 3:
                chooseSong();
                break;
            case 4:
                deleteSong();
                break;
            case 0:
                break;
            default:
                System.out.println("Incorrect option");
                break;
             }

        }while(option !=0);

    }

    public void play(){
        String pause;
        myList.play();
        System.out.println("Press 'p' to put pause and return to menu ");
        do{
            pause= myScanner.nextLine();
        }while(!pause.equals("p"));
    }

    public void chooseSong(){
        System.out.println("Make your choose ");

        int i=0;
        for(Song songAux: songs){
            System.out.println(i + " : " + songAux.toString()); /// convertimos a String el objeto songAux de tipo Song para mostrar el nombre y los datos de la cancion
            i++;
        }

        int numberSong= myScanner.nextInt();
        Song song= songs.get(numberSong);
        myList.addSong(song);
        System.out.println("Song added");
    }

    public void deleteSong(){
        System.out.println("Enter a song to delete");

        myList.watchMyList();

        int numberSong= myScanner.nextInt();
        Song song= songs.get(numberSong);
        myList.deleteSong(song);
    }

    public static List<Song> traerCanciones(){ /// guarda todas las canciones
        List<Song> songs= new ArrayList<Song>();

        Artist artist= new Artist("Gustavo Cerrati", 29, "Argentino" );
        Album album =  new Album(1990, "Best", artist);
        Song MusicaLigera= new Song("Musica ligera", "04:25", Genero.POP, album, " Charly Garcia");
        songs.add(MusicaLigera);

        Artist gunsNRoses = new Artist("Guns 'n Roses", 34, "usa");
        Album appetiteForDestruction = new Album(1987, "appetite for destruction ", gunsNRoses);
        Song sweetChildOMine = new Song("Sweet Child o' Mine", "5:38", Genero.ROCK, appetiteForDestruction, "Leon gieco");
        songs.add(sweetChildOMine);


        Artist daftPunk = new Artist("Daft Punk", 26, "French");
        Album duo = new Album(2000, "Duo", daftPunk);
        Song starboy = new Song("starboy", "4:33", Genero.POP, duo);
        songs.add(starboy);


        return songs;
    }
}

