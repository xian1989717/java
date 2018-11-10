public abstract class Shape {
  {
    System.out.println("1111");
  }
  private String color;

  public abstract double calPerimeter();

  public abstract String getType();

  public Shape() {
  };

  public Shape(String color) {
    this.color = color;
    System.out.println("2222");
  };

  public setColor(String color){
    this.color = color;
  };

  public String getColor() {
    return this.color;
  };
}