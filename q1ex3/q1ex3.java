public class q1ex3 {
  public static void main(String[] args) {
    Song beer = new Song("Beer", "Itchyworms", "OPM");
    Song lyd = new Song("Like You Do", "Joji", "R&B/Soul");
    Song odo = new Song("Odo", "Ado", "J-pop");

    Audience audienceOne = new Audience(100.00, 12);
    Audience audienceTwo = new Audience(100.00, 40);
    Audience audienceThree = new Audience(100.00, 27);

    Singer bnb = new Singer("Ben&Ben", beer);

    bnb.performForAudience(audienceOne);
    bnb.changeFavSong(lyd);
    bnb.performForAudience(audienceTwo);
    bnb.changeFavSong(odo);
    bnb.performForAudience(audienceThree);
  }
}
