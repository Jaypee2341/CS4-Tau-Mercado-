public class Singer{
  String name;
  int noOfPerformances;
  Song favoriteSong;
  double earnings;

  public Singer(String n, Song favoriteSong){
    this.name = n;
    this.favoriteSong = favoriteSong;
  }
  
  public void performForAudience(Audience audience){
    noOfPerformances += audience.audienceNumber;
    double perfEarnings = (audience.audienceNumber * audience.payment);
    earnings += perfEarnings;
    System.out.printf("%s performed %s by %s for an audience of %d people, earning them %.2f \n\nThis brings their total number of performaces to: %d performances \nThis brings their total earnings to: %.2f", name, favoriteSong.title,favoriteSong.artist, audience.audienceNumber, perfEarnings, noOfPerformances, earnings);
  }

  public void changeFavSong(Song favoriteSong){
    this.favoriteSong = favoriteSong;
    System.out.printf("\n\n%s wanted a change of genre to %s and changed their favorite song to %s\n\n", name, this.favoriteSong.genre, this.favoriteSong.title);
     
  }

  
}
