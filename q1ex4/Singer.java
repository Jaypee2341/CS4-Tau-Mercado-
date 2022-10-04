public class Singer{
  private String name;
  private int noOfPerformances;
  private Song favoriteSong;
  private double earnings;
  private static int totalPerformances;

  public Singer(String n, Song favoriteSong){
    this.name = n;
    this.favoriteSong = favoriteSong;
  }
  
  public void performForAudience(Audience audience){
    noOfPerformances += audience.getAudienceNumber();
    double perfEarnings = (audience.getAudienceNumber() * audience.getPayment());
    earnings += perfEarnings;
    System.out.printf("%s performed %s by %s for an audience of %d people, earning them %.2f \n\nThis brings their total number of performaces to: %d performances \nThis brings their total earnings to: %.2f", name, favoriteSong.getTitle(),favoriteSong.getArtist(), audience.getAudienceNumber(), perfEarnings, noOfPerformances, earnings);
  }
  
  public void changeFavSong(Song favoriteSong){
    this.favoriteSong = favoriteSong;
    System.out.printf("\n\n%s wanted a change of genre to %s and changed their favorite song to %s\n\n", name, this.favoriteSong.getGenre(), this.favoriteSong.getTitle());   
  }

}
