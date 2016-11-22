/**
 * Created by kongra on 22.11.16.
 */
public class Program {

  public static double root(double a, double b) {
    double x0 = -b / a;
    return x0;
  }

  public static void main(String[] args) {
    double result = root(2, 3);
    System.out.println("The root of y=2x+3 is " + result);
  }

}
