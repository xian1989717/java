public class Computer {
  private Output out;

  public Computer(Output out) {
    this.out = out;
  }

  public void keyIn(String msg) {
    out.get(msg);
  }

  public void print() {
    out.out();
  }
}