package com.company;

public class Album {
    private int year;
    private String title;
    private Artist artist;

    public Album(int year, String title, Artist artist) {
        this.year = year;
        this.title = title;
        this.artist = artist;
    }

    public int getYear() {
        return year;
    }

    public String getTitle() {
        return title;
    }

    public Artist getArtist() {
        return artist;
    }

    @Override
    public String toString() {
        return "\n Year: " + this.year+
                "\n Title: " + this.title+
                " \n Artist: " + this.artist;
    }
}



