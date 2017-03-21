package wawa.math;

public class Ratio {

  private interface Cloud {
    int call(int x);
  }

  public static Object makeRatio(int n, int d) {
    return (Cloud) (x) -> x == 0 ? n : d;
  }

  public static int num(Object r) {
    return ((Cloud) r).call(0);
  }

  public static int denom(Object r) {
    return ((Cloud) r).call(1);
  }

}
