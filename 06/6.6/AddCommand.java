public class AddCommand implements Command {
  public void process(int[] target) {
    int sum = 0;
    for (int tmp : target) {
      sum += tmp;
    }
    System.out.println("shu zu yuan su de zong he shi:" + sum);
  }
}