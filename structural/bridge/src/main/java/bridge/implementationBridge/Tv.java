package bridge.implementationBridge;

public class Tv implements Device{
    @Override
    public boolean isEnabled() {
        return false;
    }

    @Override
    public void enable() {

    }

    @Override
    public void disable() {

    }

    @Override
    public Integer getVolumen() {
        return null;
    }

    @Override
    public void setVolumen(Integer percent) {

    }

    @Override
    public Integer getChannel() {
        return null;
    }

    @Override
    public void setChannel(Integer channel) {

    }
}
