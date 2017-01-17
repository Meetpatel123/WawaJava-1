package oo;

class Guest {

  String name;

  Guest(String initName) {
    name = initName;
  }

  void introduceYourself() {
    System.out.println("Hello!!! My name is " +
        name + ".");
  }

}
