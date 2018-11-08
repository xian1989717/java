public class FinalVariableTest {
  final int a = 6;
  final String str;
  final int c;
  final static double d;
  {
    str = "Hello";
  }
  static {
    d = 5.6;
  }

  public FinalVariableTest() {
    c = 5;
  }

  public static void main(String[] args) {
    FinalVariableTest fvt = new FinalVariableTest();
    System.out.println(fvt.a);
    System.out.println(fvt.str);
    System.out.println(fvt.c);
    System.out.println(FinalVariableTest.d);
  }
}

