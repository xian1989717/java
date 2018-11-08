class AppleBean {
  public String name;
  public String color;
  public double weigth;

  public AppleBean() {

  }

  public AppleBean(String name, String color) {
    this.name = name;
    this.color = color;
  }

  public AppleBean(String name, String color, double weigth) {
    this(name,color);
    this.weigth = weigth;
  }
  public void myApple(){
    System.out.println("名字是:"+this.name+";颜色是:"+this.color+";重量是:"+this.weigth);
  }
}

public class Apple{
  public static void main(String[] args){
    AppleBean apple = new AppleBean("苹果","红色",10.82);
    apple.myApple();
  }
}