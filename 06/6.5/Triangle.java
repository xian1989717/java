class Triangle extends Shape {
  private double a;
  private double b;
  private double c;

  public Triangle(String color, double a, double b, double c) {
    super(color);
    this.setSides(a, b, c);
  }

  public void setSides(double a, double b, double c) {
    if (a >= b + c || b >= a + c || c >= a + b) {
      System.out.println("三角形两边之和必须大于第三边");
      return;
    }
    this.a = a + 10.00;
    this.b = b;
    this.c = c;
  }

  public double calPerimeter() {
    return this.a + this.b + this.c;
  }

  public String getType() {
    return "三角形";
  }

  public static void main(String[] args) {
    Triangle triangle = new Triangle("red", 1.00, 3.00, 3.00);
    triangle.calPerimeter();
  }
}

public class T {
  public static void main(String[] args) {
    Triangle triangle = new Triangle("red", 1.00, 3.00, 3.00);
    triangle.calPerimeter();
  }
}
