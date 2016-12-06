public class Program {

  public static int factorial(int n) {
    if (n == 0) {
      return 1;
    }
    return n * factorial(n - 1);
  }

  public static int factorial1(int n, int result) {
    if (n == 0) {
      return result;
    }
    return factorial1(n - 1, result * n);
  }

  public static int factorial2(int n) {
    int result = 1;
    while (n != 0) {
      result = result * n;
      n = n - 1;
    }
    return result;
  }

  public static int factorial3(int n) {
    int result = 1;
    for (int i = 1; i <= n; i = i + 1) {
      result = result * i;
    }
    return result;
  }

  public static double root(double a, double b) {
    double x0 = -b / a;
    return x0;
  }

  public static void main(String[] args) {
    System.out.println(factorial3(0));
    System.out.println(factorial3(1));
    System.out.println(factorial3(2));
    System.out.println(factorial3(3));
    System.out.println(factorial3(4));
    System.out.println(factorial3(5));
    System.out.println(factorial3(6));
    System.out.println(factorial3(7));
    System.out.println(factorial3(8));
    System.out.println(factorial3(9));
    System.out.println(factorial3(10));
  }

}
