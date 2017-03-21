package wawa.tv;

public class Rubin710 implements TVSet {

  private int brightness = 10;

  private int channel = 1;

  private int volume = 9;

  @Override
  public void incBrightness(int by) {
    this.brightness += by;
  }

  @Override
  public void setChannel(int chan) {
    this.channel = chan;
  }

  @Override
  public void incVolume(int by) {
    this.volume += by;
  }
}
