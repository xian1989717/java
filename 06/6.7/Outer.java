public class Outer {
  private int outProp = 9;

  class Inner {
    private int inProp = 5;

    public void acessOuterProp() {
      System.out.println("wai bu lei de outProp zhi:" + outProp);
    }
  }

  public void accessInnerProp() {
    System.out.println("nei bu lei de inProp zhi:" + new Inner().inProp);
  }

  public static void main(String[] args) {
    Outer o = new Outer();
    o.accessInnerProp();
  }
}