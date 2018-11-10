public class DiscernVariable {
  private String prop = "wai bu lei de shi li bian liang";
  public double num = 10.55;

  private class InClass {
    private String prop = "nei bu lei de shi li bian liang";

    public void info() {
      String prop = "ju bu bian liang";
      System.out.println("wai bu lei de shi li bian liang zhi:" + DiscernVariable.this.prop);
      System.out.println(DiscernVariable.this.num);
      System.out.println("nei bu lei de shi li bian liang zhi:" + this.prop);
      System.out.println("ju bu bian liang de zhi:" + prop);
    }
  }

  public void test() {
    InClass in = new InClass();
    in.info();
  }

  public static void main(String[] args) {
    new DiscernVariable().test();
  }
}