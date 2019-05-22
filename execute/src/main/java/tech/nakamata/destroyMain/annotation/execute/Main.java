package tech.nakamata.destroyMain.annotation.execute;

import tech.nakamata.destroyMain.annotation.HelloWorld;

public class Main {

  public static void main(String[] args) {
    Annotated annotated = new Annotated();
    annotated.execute();

  }

  public static class Annotated {

    @HelloWorld
    void execute() {
      System.out.println("=============================");
      System.out.println("This println will be overridden");
      System.out.println("=============================");
    }
  }
}
