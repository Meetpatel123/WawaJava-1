package oo;

class Program {

  public static void main(String[] args) {
    Foo o1 = new Foo();
    o1.welcome("Anna");
    o1.welcome("John");

    Guest g1 = new Guest("Tom");
    Guest g2 = new Guest("Eva");

    g1.introduceYourself();
    g2.introduceYourself();
  }

}
