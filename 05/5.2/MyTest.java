class Test {
  int a;
  int b;
}

public class MyTest {

  public void change(Test t) {
    System.out.println(t.a + "..." + t.b);
    int tmp = t.a;
    t.a = t.b;
    t.b = tmp;
    System.out.println("t.a的值是:" + t.a + ";t.b的值是:" + t.b);
  }

  public static void main(String[] args) {
    Test t = new Test();
    t.a = 10;
    t.b = 20;
    new MyTest().change(t);
    System.out.println("-------------------");
    System.out.println("t.a的值是:" + t.a + ";t.b的值是:" + t.b);
  }
}