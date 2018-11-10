public class EnumTest {
  public void judge(SeasonEnum s) {
    switch (s) {
    case SPRING:
      System.out.println("chun nuan hua kai,zheng hao ta qing");
      break;
    case SUMNER:
      System.out.println("xia ri yan yan,shi he you yong");
      break;
    case FALL:
      System.out.println("qiu gao qi shuang,jin bu ji shi");
      break;
    case WINTER:
      System.out.println("dong ri xue piao,wei lu shang xue");
      break;
    default:
      break;
    }
  }

  public static void main(String[] args) {
    for (SeasonEnum s : SeasonEnum.values()) {
      System.out.println(s);
    }
    
    new EnumTest().judge(SeasonEnum.SPRING);
  }
}