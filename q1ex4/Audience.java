public class Audience{
  private double payment;
  private int audienceNumber;

  public Audience(double p, int n){
      payment = p;
      audienceNumber = n;
  }
  public double getPayment(){
    return payment;
  }
  public int getAudienceNumber(){
    return audienceNumber;
  }
}
