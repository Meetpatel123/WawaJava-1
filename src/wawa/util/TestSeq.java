package wawa.util;

public class TestSeq {

  public static void main(String... args) {
    System.out.println(Seq.of(2L, 7L, 5L));
    System.out.println(Seq.of(2L, 7L));
    System.out.println(Seq.of(2L));
    System.out.println(Seq.nil());
  }

}
