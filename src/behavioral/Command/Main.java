package behavioral.Command;

import behavioral.Command.acCommand.TurnOffAcCommand;
import behavioral.Command.acCommand.TurnOnAcCommand;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        AirConditioner airConditioner = new AirConditioner();

        Command turnOnAcCommand = new TurnOnAcCommand(airConditioner);

        RemoteControl remoteControl = new RemoteControl();

        remoteControl.setCommand(turnOnAcCommand);

        remoteControl.pressButton();

        Command turnOffAcCommand = new TurnOffAcCommand(airConditioner);

        remoteControl.setCommand(turnOffAcCommand);

        remoteControl.pressButton();

        remoteControl.undo();

        remoteControl.undo();

        remoteControl.undo();
    }
}
