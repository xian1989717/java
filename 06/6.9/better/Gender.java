public enum Gender {
  MALE, FEMALE;
  private String name;

  public void setName(String name) {
    switch (this) {
    case MALE:
      if (name.equals("nan")) {
        this.name = name;
      } else {
        System.out.println("can shu cuo wu");
      }
      break;
    case FEMALE:
      if (name.equals("nv")) {
        this.name = name;
      } else {
        System.out.println("can shu cuo wu");
      }
    default:
      break;
    }
  }

  public String getName() {
    return this.name;
  }
}