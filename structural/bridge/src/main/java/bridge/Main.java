package bridge;

import bridge.abstractBridge.AdvancedRemoteControl;
import bridge.abstractBridge.RemoteControl;
import bridge.implementationBridge.Radio;
import bridge.implementationBridge.Tv;

public class Main {

    public static void main(String[] args) {

        Tv tv = new Tv();
        RemoteControl remoteControl = new RemoteControl(tv);
        remoteControl.togglePower();

        Radio radio = new Radio();
        AdvancedRemoteControl advancedRemoteControl = new AdvancedRemoteControl(radio);

    }

}