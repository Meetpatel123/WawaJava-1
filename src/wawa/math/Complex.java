package wawa.math;

class Complex {

  final double re;

  final double im;

  Complex(double re, double im) {
    this.re = re;
    this.im = im;
  }

  Complex add(Complex other) {
    return new Complex(
        this.re + other.re,
        this.im + other.im);
  }

}
