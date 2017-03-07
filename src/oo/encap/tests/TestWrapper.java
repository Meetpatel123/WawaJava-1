package oo.encap.tests;

import oo.encap.Wrapper;

public class TestWrapper {

  public static void main(String[] args) {
    Wrapper w = new Wrapper();

    // System.out.println(w.onlyForMe);
    // System.out.println(w.forMyPackageFriends);
    // System.out.println(w.forMyAncestors);
    System.out.println(w.forAll);
  }

}
