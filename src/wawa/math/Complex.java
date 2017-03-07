package wawa.math;

public class Complex {

  public final double re;

  public final double im;

  public Complex(double re, double im) {
    this.re = re;
    this.im = im;
  }

  public Complex(double re) {
    this(re, 0);
  }

  public Complex add(Complex other) {
    return new Complex(
        this.re + other.re,
        this.im + other.im);
  }

}
