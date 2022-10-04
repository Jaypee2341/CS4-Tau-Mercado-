public class Song{
  private String title;
  private String artist;
  private String genre;
  
  public Song(String t, String a, String g){
        title = t;
        artist = a;
        genre = g;
  }

  public String getTitle(){
    return title;
  }
  public String getArtist(){
    return artist;
  }
  public String getGenre(){
    return genre;
  }
}
