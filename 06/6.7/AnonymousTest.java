interface Product {
  public double getPrice();

  public String getName();
}

class ProductSon implements Product {
  public double price;
  public String name;

  public void setName(String name) {
    this.name = name;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public String getName() {
    return this.name;
  }

  public double getPrice() {
    return this.price;
  }
}

public class AnonymousTest {
  public void test(Product p) {
    System.out.println("gou mai le yi ge " + p.getName() + ",hua diao le " + p.getPrice());
  }

  public static void main(String[] args) {
    AnonymousTest ta = new AnonymousTest();
    ProductSon p = new ProductSon();
    p.setName("pick");
    p.setPrice(10.88);
    ta.test(p);
  }
}