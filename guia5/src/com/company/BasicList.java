package com.company;
import java.util.Stack;

public class BasicList extends ReproductionList{

    public Stack <Song> myList; /// create a Song`s stack

    public BasicList()
    {
        super("BasicList");
        this.myList= new Stack<Song>();
    }

    public BasicList(String name, Stack<Song> myList) {
        super(name);
        this.myList = myList;
    }

    public Stack<Song> getMyList() {
        return myList;
    }

    public void setMyList( Stack<Song> myList) {
        this.myList = myList;
    }

    @Override
    public void play() {
       Song song= myList.pop(); /// sacamos un elemento de la pila
        Stack<Song> listAux= new Stack<>(); /// create a auxiliar stack
        for(Song songAux: myList){
            listAux.push(songAux); /// apilamos in listAux
        }
        listAux.push(song); /// apilamos la cancion en la lista auxiliar
        myList= listAux;
        System.out.println("Playing: "+ song.toString());
    }

    @Override
    public void addSong(Song song) {
        this.myList.push(song);

    }

    @Override
    public void deleteSong(Song song) {
        System.out.println("------------------------------");
        System.out.println("You have to buy Premium pack");
        System.out.println("------------------------------");

    }

    @Override
    public void watchMyList() {
        System.out.println(this.getName());
        int i=0;
        for(Song songAux: myList){
            System.out.println(i + ":" + songAux.toString());
            i++;
        }

    }
}
