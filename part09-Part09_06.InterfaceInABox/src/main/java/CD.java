/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aayus
 */
public class CD implements Packable{
    private String artist;
    private String song;
    private int publicationYear;

    public CD(String artist, String song, int publicationYear) {
        this.artist = artist;
        this.song = song;
        this.publicationYear = publicationYear;
    }
    
    public double weight(){
        return 0.1;
    }
    public String toString(){
        return this.artist+": "+this.song+" ("+this.publicationYear+")";
    }
}
