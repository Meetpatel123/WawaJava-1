package wawa.util;

public class TestList {

  public static void main(String... args) {
    List<Integer> l1 = new List<>(3, new List<>(5, new List<>(6, new List<>(2, null))));
    System.out.println(l1);

  }

}
