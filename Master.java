
public abstract class Master implements Interaction{
  protected String name;

  
  @Override
  public abstract String toString();

  @Override
  public abstract void call(Pet pet);
}
