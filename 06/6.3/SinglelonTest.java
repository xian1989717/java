class Singleton {
  private static Singleton instance;
  private String name;

  private Singleton() {

  }

  public static Singleton getInstance() {
    if (instance == null) {
      instance = new Singleton();
    }
    return instance;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }
}

class MyPer {

}

public class SinglelonTest {
  public static void main(String[] args) {
    Singleton s1 = Singleton.getInstance();
    Singleton s2 = Singleton.getInstance();
    s1.setName("peter");
    System.out.println(s1.getName());
    System.out.println(s1 == s2);
    MyPer mp1 = new MyPer();
    MyPer mp2 = new MyPer();
    System.out.println(mp1.equals(mp2));
  }
}