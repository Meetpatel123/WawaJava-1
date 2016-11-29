public class Quadratic {

  public static void printRoots(double a, double b, double c) {
    double delta = b * b - 4 * a * c;
    if(delta < 0) {
      System.out.println("No roots here!!!");
    }
    else if(delta == 0) {
      double x0 = -b / (2 * a);
      System.out.println("One root: " + x0);
    }
    else {
      double x0 = (-b - Math.sqrt(delta))/ (2 * a);
      double x1 = (-b + Math.sqrt(delta))/ (2 * a);
      System.out.println("Two squares: " + x0 + ", " + x1);
    }
  }

  public static void main(String[] args) {
    printRoots(1, 0, 0);
  }

}
