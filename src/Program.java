public class Program {

  public static int factorial(int n) {
    if(n == 0) {
      return 1;
    }
    return n * factorial(n-1);
  }

  public static double root(double a, double b) {
    double x0 = -b / a;
    return x0;
  }

  public static void main(String[] args) {
    System.out.println(factorial(0));
    System.out.println(factorial(1));
    System.out.println(factorial(2));
    System.out.println(factorial(3));
    System.out.println(factorial(4));
    System.out.println(factorial(5));
    System.out.println(factorial(6));
    System.out.println(factorial(7));
    System.out.println(factorial(8));
    System.out.println(factorial(9));
    System.out.println(factorial(10));
  }

}
