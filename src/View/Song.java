/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author user
 */
public class Song {
    private String title, album, genre, artist;
    private String year;
            
    public Song(String title, String album, String genre, String year, String artist)
    {
        this.title = title;
        this.album = album;
        this.genre = genre;
        this.year = year;
        this.artist = artist;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public String getAlbum()
    {
        return album;
    }
    
    public String getGenre()
    {
        return genre;
    }
    
    public String getYear()
    {
        return year;
    }
    
    public String getArtist()
    {
        return artist;
    }
}
