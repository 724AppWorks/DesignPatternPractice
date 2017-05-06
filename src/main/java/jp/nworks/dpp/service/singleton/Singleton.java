package jp.nworks.dpp.service.singleton;

public class Singleton {
  private static Singleton singleton = new Singleton();

  private Singleton() {
  }

  public static Singleton getInstance() {
    return singleton;
  }

  public String getValue() {
    return "this is singleton method";
  }
}
