public class Mister extends Master{

  @Override
  public void call(Pet pet) {
    if (pet instanceof Cat) pet.replyPositive();
    else if (pet instanceof Hamster) pet.replyNegative();
  }

  public Mister(String name){
    super();
  }

  @Override
  public String toString() {
    return "Name: " + name;
  }
  
}
