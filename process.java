public class process {
  public static void main(String[] args) {
    // Master m1 = new Master("Mark", "Male");
    // Master m2 = new Master("Victoriia", "Female");

    Mister m1 = new Mister("Mark");
    Mistress ms1 = new Mistress();
    // Master m2 = new Mister();

    Cat c1 = new Cat();
    Hamster h1 = new Hamster();
    
    // System.out.println(m1);
    // System.out.println(m2);

    // m1.call(c1);
    // m1.call(h1);

    m1.call(c1); // Meow..
    m1.call(h1); // Shh, you are not my master.
    System.out.println("-------");

    ms1.call(c1); // Shh, you are not my master.
    ms1.call(h1); // Frr..)
    System.out.println("-------");

    System.out.println(m1);

  }
}
