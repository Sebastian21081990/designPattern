package bridge.abstractBridge;

import bridge.implementationBridge.Device;

public class RemoteControl {

    protected Device device;

    public RemoteControl(Device device){
        this.device = device;
    }

    public void togglePower(){
        if(device.isEnabled()){
            device.disable();
        }else {
            device.enable();
        }
    }

    public void volumenDown(){
        device.setVolumen(device.getVolumen() - 10);
    }

    public void volumenUp(){
        device.setVolumen(device.getVolumen() + 10);
    }

    public void channelDown(){
        device.setChannel(device.getChannel() - 1);
    }

    public void channelUp(){
        device.setChannel(device.getChannel() + 1);
    }

}
