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
    totalPerformances += audience.getAudienceNumber();
    double perfEarnings = (audience.getAudienceNumber() * audience.getPayment());
    earnings += (audience.getAudienceNumber() * audience.getPayment());
    System.out.printf("%s performed %s by %s for an audience of %d people, earning %.2f \n\nThis brings the total number of performances of %s to: %d performances \nThis brings the total number of performances of both singers to: %d \nThis brings %s' total earnings to: %.2f", name, favoriteSong.getTitle(),favoriteSong.getArtist(), audience.getAudienceNumber(), perfEarnings, name, noOfPerformances, totalPerformances, name, earnings);
  }
  
  public void performForAudience(Audience audience, Singer singer){
    noOfPerformances += audience.getAudienceNumber();
    singer.noOfPerformances += audience.getAudienceNumber();
    totalPerformances += (2*audience.getAudienceNumber());
    double perfEarnings = (audience.getAudienceNumber() * audience.getPayment() / 2);
    earnings += (audience.getAudienceNumber() * audience.getPayment()/2);
    singer.earnings += (audience.getAudienceNumber() * audience.getPayment()/2);
    System.out.printf("%s and %s performed %s by %s for an audience of %d people, earning %.2f each \n\nThis brings the total number of performances of %s to: %d performances \nThis brings the total number of performances of %s to: %d performances \nThis brings the total number of performances of both singers to: %d \nThis brings %s's total earnings to: %.2f \nThis brings %s's total earnings to: %.2f", name, singer.getName(), favoriteSong.getTitle(),favoriteSong.getArtist(), audience.getAudienceNumber(), perfEarnings, name, noOfPerformances, singer.getName(), singer.getNoOfPerformances(), totalPerformances, name, earnings, singer.getName(), singer.getEarnings());
  }
  
  public void changeFavSong(Song favoriteSong){
    this.favoriteSong = favoriteSong;
    System.out.printf("\n\n%s wanted a change of genre to %s and changed their favorite song to %s\n\n", name, this.favoriteSong.getGenre(), this.favoriteSong.getTitle());   
  }

  public String getName(){ 
    return name; 
  }

  public int getNoOfPerformances(){ 
    return noOfPerformances; 
  }

  public double getEarnings(){ 
    return earnings; 
  }

}
