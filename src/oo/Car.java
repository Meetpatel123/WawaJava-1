package oo;

class Car {

  double acc;

  double maxSpeed;

  double speed;

  public Car(double acc, double maxSpeedkmPh) {
    this.acc = acc;
    this.maxSpeed = maxSpeedkmPh * 1000.0 / 3600.0;
  }

  void start() {
    long time = 0;
    for(;;) {
      time += 1;
      double newSpeed = this.speed + this.acc;
      if(newSpeed <= this.maxSpeed) {
        this.speed = newSpeed;
      } else {
        this.speed = maxSpeed;
      }
      System.out.println("My current speed is " + this.speed);

      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

  public static void main(String[] args) {
    Car c = new Car(2, 230);
    c.start();
  }
}
