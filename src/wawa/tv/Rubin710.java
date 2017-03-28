package wawa.tv;

public class Rubin710 implements TVSet {

  private int brightness = 10;

  private int channel = 1;

  private int volume = 9;

  private boolean on;

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

  @Override
  public void turnOn() {
    this.on = true;
  }

  @Override
  public void turnOff() {
    this.on = false;
  }

  @Override
  public boolean isOn() {
    return this.on;
  }
}
