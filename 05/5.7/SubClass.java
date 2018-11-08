class BaseClass {
  public int book = 6;

  public void base() {
    System.out.println("父类的普通方法");
  }

  public void test() {
    System.out.println("父类的被覆盖的方法");
  }
}

public class SubClass extends BaseClass {
  public String book = "轻量级Java EE 企业应用实战";

  public void test() {
    System.out.println("子类的覆盖父类的方法");
  }

  public void sub() {
    System.out.println("子类的普通方法");
  }

  public static void main(String[] args) {
    BaseClass bc = new BaseClass();
    System.out.println(bc.book);
    bc.base();
    bc.test();
    System.out.println("----------------");
    SubClass sc = new SubClass();
    System.out.println(sc.book);
    sc.base();
    sc.test();
    System.out.println("----------------");
    BaseClass polymophicBc = new SubClass();
    System.out.println(polymophicBc.book);
    polymophicBc.base();
    polymophicBc.test();
    Object objPri = new Integer(5);
    System.out.println(objPri);
    if (objPri instanceof String) {
      String str = (String) objPri;
      System.out.println(str);
    }
  }
}