package fun.codepie.extend;

public class Student extends Person {
  public int age;

  public void study() {
    System.out.println("study from student");
  }

  @Override
  public void hello() {
    System.out.println("重写的实现");
  }
}
