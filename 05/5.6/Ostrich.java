public class Ostrich extends Bird {
  public void fly() {
    System.out.println("我只能在地上奔跑...");
  }

  public void extendFly() {
    super.fly();
  }

  public static void main(String[] args) {
    Ostrich os = new Ostrich();
    os.fly();
    os.extendFly();
  }
}