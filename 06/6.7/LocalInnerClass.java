public class LocalInnerClass {
  public static void main(String[] args) {
    class InnerBase {
      int a;
    }
    class INnerSub extends InnerBase {
      int b;
    }
    InnerSub is = new InnerSub();
    is.a = 5;
    is.b = 8;
    System.out.println("InnerSub dui xiang de a he b shi li bian liang shi:" + is.a + "," + is.b);
  }
}