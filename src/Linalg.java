public class Linalg {

  public static void printVector(double[] x) {
    int n = x.length;
    System.out.print("[");
    for (int i = 0; i < n; i += 1) {
      System.out.print(x[i]);
      if (i != (n - 1)) {
        System.out.print(", ");
      }
    }
    System.out.println("]");
  }

  public static double square(double xi) {
    return xi * xi;
  }

  public static double euclideanNorm(double[] x) {
    double sumOfSquares = 0;
    for (int i = 0; i < x.length; i += 1) {
      sumOfSquares += square(x[i]);
    }
    return Math.sqrt(sumOfSquares);
  }

  public static double dotProduct(double[] x, double[] y) {
    double value = 0;
    for (int i = 0; i < x.length && i < y.length; i += 1) {
      value += x[i] * y[i];
    }
    return value;
  }

  public static boolean isZero(double d) {
    return Math.abs(d) < 0.000001;
  }

  public static boolean areOrthogonal(double[] x, double[] y) {
    return isZero(dotProduct(x, y));
  }

  public static double angleBetween(double[] x, double[] y) {
    double cosA = dotProduct(x, y) /
        (euclideanNorm(x) * euclideanNorm(y));
    return Math.acos(cosA);
  }

  public static void main(String[] args) {
    double[] x = {1, 2, 5};
    double[] y = {0, 3, 4};

    System.out.println(dotProduct(x, y));
    System.out.println(angleBetween(x, y));

//    double[] x;
//    x = new double[3];
//    x[0] = 5;
//    x[1] = -2;
//    x[2] = 7;

//    System.out.println(x[0]);
//    System.out.println(x[1]);
//    System.out.println(x[2]);
//    printVector(x);

//    double[] y = new double[] {3, 2, 1};
//    printVector(y);
//    System.out.println(y[0]);
//    System.out.println(y[1]);
//    System.out.println(y[2]);

//    double[] z = {6, -10, -12};
//    printVector(z);
//    System.out.println(z[0]);
//    System.out.println(z[1]);
//    System.out.println(z[2]);

//    double[] w = new double[3];
//    Scanner s = new Scanner(System.in);
//    System.out.print("Enter w[0] "); w[0] = s.nextDouble();
//    System.out.print("Enter w[1] "); w[1] = s.nextDouble();
//    System.out.print("Enter w[2] "); w[2] = s.nextDouble();
//    printVector(w);
//    System.out.println(w[0]);
//    System.out.println(w[1]);
//    System.out.println(w[2]);
  }

}
