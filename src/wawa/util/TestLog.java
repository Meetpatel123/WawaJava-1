package wawa.util;

public class TestLog {

  static void f1() {
    System.out.println("f1()");
  }

  static void f2() {
    System.out.println("f2()");
  }

  static void f3() {
    System.out.println("f3()");
  }

  static void foo() {
    Log.before("foo()");
    f1();
    f2();
    f3();
    Log.after("foo()");
  }

  static void foo1() {
    Runnable body = new Foo1();
    Log.around("foo1()", body);
  }

  static void foo2() {
    Runnable body = new Runnable() {
      @Override
      public void run() {
        f1();
        f2();
        f3();
      }
    };
    Log.around("foo2()", body);
  }

  static void foo3() {
    Log.around("foo2()", new Runnable() {
      @Override
      public void run() {
        f1();
        f2();
        f3();
      }
    });
  }

  static void goo() {
    Log.before("goo()");    f1();
  }

  public static void main(String[] args) {
    // foo();
    // foo1();
    foo2();
    // goo();
  }

}
