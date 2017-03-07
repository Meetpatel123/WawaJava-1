package wawa.biology;

public class Animal {

  private long numberOfCells;

  private double energy;

  public long numberOfCells() {
    return this.numberOfCells;
  }

  public void digest(int amountOfFood) {
    this.energy += amountOfFood * 0.002;
    this.numberOfCells += amountOfFood * 10000;
  }

}
