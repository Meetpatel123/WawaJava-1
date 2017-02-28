package wawa.math;

public class TestComplex {

  public static void main(String[] args) {
    Complex a = new Complex(2, 3);
    Complex b = new Complex(1, 7);
    Complex c = a.add(b);

    System.out.println(c.re);
    System.out.println(c.im);

  }

}
