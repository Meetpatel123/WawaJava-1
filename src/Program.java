class Program {

  public static void main(String[] args) {
    Point p1 = new Point(4.25, 3.14, -1.25);
    Point p2 = new Point(6, 7, 8);
    // p1.x = 4.25;
    // p1.y = 3.14;
    // p1.z = -1.25;

    System.out.println(p1.x);
    System.out.println(p1.y);
    System.out.println(p1.z);

    Distance d1 = new Distance(1.45,
        -2.67,
        0.034);
    // d1.dx = 1.45;
    // d1.dy = -2.67;
    // d1.dz = 0.034;

    System.out.println(d1.dx);
    System.out.println(d1.dy);
    System.out.println(d1.dz);
  }

}
