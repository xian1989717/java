 public interface Output {
  // 接口里定义的成员变量只能是常亮
  int MAX_CACHE_LINE = 50;

  // 接口里定义的普通方法只能是public的抽象方法 ---子接口可以去复写/实现
  void out();

  void getData(String msg);

  // 在接口中定义默认方法,需要使用default修饰 ---初始化状态,配置项
  default void print(String... msgs) {
    for (String msg : msgs) {
      System.out.println(msg);
    }
  }

  default void test() {
    System.out.println("默认的test()方法");
  }

  // 在接口中定义类方法,需要使用static修饰 ---静态方法
  static String staticTest() {
    return "接口里的类方法";
  }
}