package wawa;

import java.util.ArrayList;
import java.util.List;

public class TestCollections {

  public static void printLengths(List<String> names) {
    for (int i = 0; i < names.size(); i++) {
      System.out.println(names.get(i).length());
    }
  }

  public static void main(String... args) {
    List<String> names = new ArrayList<>();
    names.add("John");
    names.add("Anna");
    names.add("Tom");
    names.add("Sandra");

    // boolean b = names.contains("Anna");
    // System.out.println(b);

    // Ex. 1. 1-st take
//    System.out.println(names.get(0).length());
//    System.out.println(names.get(1).length());
//    System.out.println(names.get(2).length());

    // Ex. 1. 2-nd take
    printLengths(names);
  }

}
