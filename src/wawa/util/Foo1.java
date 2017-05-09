package wawa.util;

public class Foo1 implements Runnable {

  @Override
  public void run() {
    TestLog.f1();
    TestLog.f2();
    TestLog.f3();
  }

}
