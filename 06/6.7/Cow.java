public class Cow {
  private double weight;

  public Cow() {
  };

  public Cow(double weight) {
    this.weight = weight;
  }

  private class CowLeg {
    private double length;
    private String color;

    public CowLeg() {
    };

    public CowLeg(double length, String color) {
      this.length = length;
      this.color = color;
    }

    public void setColor(String color) {
      this.color = color;
    }

    public void setLength(double length) {
      this.length = length;
    }

    public double getLength() {
      return length;
    }

    public String getColor() {
      return color;
    }

    public void info() {
      System.out.println("dang qian niu tui yan se shi:" + color + ",gao:" + length);
      System.out.println("ben niu tui suo zai nan niu zhong:" + weight);
    }
  }

  public void test() {
    CowLeg c1 = new CowLeg(1.12, "hei bai xiang jian");
    c1.info();
  }

  public static void main(String[] args) {
    Cow cow = new Cow(378.9);
    cow.test();
  }
}