package wawa.tv;

public interface TVSet extends Device {

  void incBrightness(int by);

  void setChannel(int chan);

  void incVolume(int by);

}
