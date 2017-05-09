package wawa.util;

public class Log {

  public static void before(String msg) {
    System.out.println("BEFORE: " + msg);
  }

  public static void after(String msg) {
    System.out.println("AFTER: " + msg);
  }

  public static void around(String msg, Runnable body) {
    before(msg);
    body.run();
    after(msg);
  }
}
