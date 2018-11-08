public class PrintCommand implements Command {
  public void process(int[] target) {
    for (int tmp : target) {
      System.out.println("die dai shu chu mu biao shu zu de yuan su:" + tmp);
    }
  }
}