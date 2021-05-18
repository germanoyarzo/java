package com.company;
import java.util.LinkedList;
import java.util.List;

public class PremiumList extends ReproductionList{


    LinkedList <Song> myLists;

    public PremiumList() {
        super("Premium List");
        this.myLists = new LinkedList<Song>();
    }

    public LinkedList<Song> getMyLists() {
        return myLists;
    }

    public void setMyLists(LinkedList<Song> myLists) {
        this.myLists = myLists;
    }





    @Override
    public void play() {
        Song song = myLists.removeFirst();
        myLists.addLast(song); /// we add the last song
        System.out.println("------------------------------");
        System.out.println("Playing: " + song.toString());
        System.out.println("------------------------------");

    }

    @Override
    public void addSong(Song song) {
        this.myLists.add(song);
    }

    @Override
    public void deleteSong(Song song) {
        this.myLists.remove(song);
    }


    @Override
    public void watchMyList() {
        System.out.println(this.getName());
        int i=0;
        for(Song songAux: myLists){
            System.out.println(i+ " : " + songAux.toString());
            i++;
        }
    }
}
