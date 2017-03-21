package wawa.tv;

public class TestTV {

  public static void main(String[] args) {
    TVSet rubin = new Rubin710();
    rubin.incBrightness(3);
    rubin.incVolume(4);
    rubin.setChannel(3);
  }

}
