public class Hamster extends Pet{

  @Override
  public void come() {
    System.out.println("Hamster goes to master.");
    
  }

  @Override
  public void eat() {
    System.out.println("Hamster goes to the cage.");
  }

  @Override
  public void replyPositive() {
    System.out.println("Frr..)");
    
  }

  @Override
  public void replyNegative() {
    System.out.println("Shh, you are not my master."); 
  }
  
}
