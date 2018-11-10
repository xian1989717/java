interface Product {
  int getProduceTime();
}

public class Printer implements Output, Product {
  private String[] printData = new String[MAX_CACHE_LINE];
  private int dataNum = 0;

  public void out() {
    while (dataNum > 0) {
      System.out.println("print" + printData[0]);
      System.arraycopy(printData, 1, printData, 0, --dataNum);
    }
  };

  public void getData(String msg) {
    if (dataNum >= MAX_CACHE_LINE) {
      System.out.println("shu chu dui lie yi man,tian jia shi bai");
    } else {
      printData[dataNum + 1] = msg;
    }
  }

  public int getProduceTime() {
    return 45;
  }

  public static void main(String[] args) {
    Output o = new Printer();
    o.getData("qing liang ji");
    o.getData("feng kuang JAVA jiang yi");
    o.out();
    o.getData("feng kuang Android jiang yi");
    o.getData("feng kuang Ajax jiang yi");
    o.out();
    o.print("monkey", "pig", "white bone demon");
    o.test();

    Product p = new Printer();
    System.out.println(p.getProduceTime());
  }
}
