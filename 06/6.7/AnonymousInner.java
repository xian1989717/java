abstract class Device {
  private String name;

  public abstract double getPrice();

  public Device() {

  }

  public Device(String name) {
    this.name = name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }
}

public class AnonymousInner {
  public void test(Device d) {
    System.out.println("gou mai le yi ge " + d.getName() + ",hua diao le " + d.getPrice());
  }

  public static void main(String[] args) {
    AnonymousInner ai = new AnonymousInner();
    ai.test(new Device("dian zi xian shi qi") {
      public double getPrice() {
        return 687.8;
      }
    });
  }
}