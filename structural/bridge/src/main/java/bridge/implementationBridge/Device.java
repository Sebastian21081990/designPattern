package bridge.implementationBridge;

public interface Device {

    boolean isEnabled();
    void enable();
    void disable();
    Integer getVolumen();
    void setVolumen(Integer percent);
    Integer getChannel();
    void setChannel(Integer channel);

}
