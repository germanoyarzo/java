package com.company;

public class Song {
    private String name;
    private String duration;
    private Genero genero;
    private Album album;
    private String artistInvitated;

    public Song(String name, String duration, Genero genero, Album album) {
        this.name = name;
        this.duration = duration;
        this.genero = genero;
        this.album = album;
    }

    public Song(String name, String duration, Genero genero, Album album, String artistInvitated) {
        this.name = name;
        this.duration = duration;
        this.genero = genero;
        this.album = album;
        this.artistInvitated = artistInvitated;
    }

    ///region GETTERS

    public String getName() {
        return name;
    }

    public String getDuration() {
        return duration;
    }

    public Genero getGenero() {
        return genero;
    }

    public Album getAlbum() {
        return album;
    }

    public String getArtistInvitated() {
        return artistInvitated;
    }

    public void setArtistInvitated(String artistInvitated) {
        this.artistInvitated = artistInvitated;
    }
    /// endregion

    @Override
    public String toString() {
        String guest= " ";

        if(artistInvitated!= null){
            guest= " ft -" + artistInvitated;
        }

        return "\n Song: "+
                "\n Name: " + this.name+
                "\n Duration: " + this.duration+
                "\n Genero: " + this.genero+
                "\n Album: " + this.album+
                "\n Artist Invitated: " + this.artistInvitated;
    }
}
