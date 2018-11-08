public class OutputFactory {
  public Output getOutput() {
    return new Printer();
  }

  public static void main(String[] args) {
    OutputFactory of = new OutputFactory();
    Computer c = new Computer(of.getOutput());
    c.keyIn("qing liang ji Java EE qi ye ying yong shi zhan");
    c.keyIn("feng kuang Java jiang yi");
    c.print();
  }
}