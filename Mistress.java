public class Mistress extends Master{

  @Override
  public void call(Pet pet) {
    if (pet instanceof Cat) pet.replyNegative();
    else if (pet instanceof Hamster) pet.replyPositive();
  }

  @Override
  public String toString() {
    return "Name: " + name;
  }
  
}
