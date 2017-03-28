package wawa.tv;

public class TestTV {

  static void turn(Device d, boolean on) {
    if (on)
      d.turnOn();
    else
      d.turnOff();
  }

  public static void main(String[] args) {
    TVSet rubin = new Rubin710();

    turn(rubin, true);

    rubin.incBrightness(3);
    rubin.incVolume(4);
    rubin.setChannel(3);
  }

}
