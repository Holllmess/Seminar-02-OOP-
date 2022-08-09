public class Cat extends Pet{

  @Override
  public void come() {
    System.out.println("Cat goes to master.");
    
  }


  @Override
  public void eat() {
    System.out.println("Cat goes to the kitchen.");
    
  }

  @Override
  public void replyPositive() {
    System.out.println("Meow..");
    
  }

  @Override
  public void replyNegative() {
    System.out.println("Shh, you are not my master.");
    
  }
  
}
