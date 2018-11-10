class StaticOut {
  static class StaticIn {
    public StaticIn() {
      System.out.println("jing tai nei bu lei de gou zao qi");
    }
  }
}

public class CreateStaticInnerInstance {
  public static void main(String[] args) {
    StaticOut.StaticIn in = new StaticOut.StaticIn();
  }
}