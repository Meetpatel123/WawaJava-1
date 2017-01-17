public class Heron {

  static final double e = 0.00001;

  static double sqrt(double y, double x) {
    if (isGoodEnough(y, x))
      return y;
    else
      return sqrt(f(y, x), x);
  }

  static double f(double y, double x) {
    return avg(y, x / y);
  }

  static double avg(double x, double y) {
    return (x + y) / 2;
  }

  static boolean isGoodEnough(double y, double x) {
    return abs(square(y) - x) < e;
  }

  static double abs(double x) {
    if (x < 0)
      return -x;
    else
      return x;
  }

  static double square(double x) {
    return x * x;
  }

  public static void main(String[] args) {
    double y1 = sqrt(1, 4);
    System.out.println(y1);
  }

}
