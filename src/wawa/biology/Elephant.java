package wawa.biology;

public class Elephant extends Animal {

  private double height = 3;

  public void useTrunk() {
    System.out.println("I'm using my awesome trunk!!!");
  }

  @Override
  public void digest(int amountOfFood) {
    super.digest(amountOfFood);
    this.height += 0.005;
  }
}
