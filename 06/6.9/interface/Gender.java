public enum Gender implements GenderDesc {
  MALE("nan"), FEMALE("nv");
  private final String name;

  private Gender(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void info() {
    System.out.println("zhe shi yi ge yong yu ding yi xing bie de mei ju lei");
  }
}