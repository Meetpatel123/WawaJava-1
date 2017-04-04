package wawa.util;

public class TestPair {

  static Pair<Integer, Integer> goo(int x) {
    return new Pair<>(x + 3, x - 2);
  }

  public static void main(String... args) {
    Pair<Integer, Integer> p = new Pair<>(1, 2);
    System.out.println(p);
    System.out.println(goo(5));

    new Pair<>(3, 4);
    new Pair<>(2, 3.14);

    Pair<String, Integer> p1 = new Pair<>("abc", 1);
    String  s1 = p1.first();
    Integer b1 = p1.second();
    System.out.println(s1 + " " + b1);

    Pair<String, Boolean> p2 = new Pair<>("abc", true);

  }

}
