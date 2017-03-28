import wawa.math.Complex;
import wawa.math.Ratio;

class Program {

  static double foo(double x) {
    return 2 * x + 3;
  }

  static double goo(double x) {
    return x + 0.34;
  }

  static double goo(int x) {
    return x + 3.21;
  }

  static void printObject(Object obj) {
    System.out.println("Object is " + obj.toString());
  }

  public static void main(String[] args) {
    double a = 3.145;
    int    b = 3;
    foo(a);
    foo(b);

    goo(a);
    goo(b);
    
    String  s = "abcd";
    Object  r = Ratio.makeRatio(2, 3);
    Complex c = new Complex(4, 5);
    printObject(s);
    printObject(r);
    printObject(c);
  }

}
