package wawa.biology;

public class TestAnimals {

  public static void main(String[] args) {
    Elephant e = new Elephant();
    e.useTrunk();
    e.digest(10);
    System.out.println(e.numberOfCells());
  }

}
