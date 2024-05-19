package behavioral.Command.acCommand;

import behavioral.Command.AirConditioner;
import behavioral.Command.Command;

public class TurnOffAcCommand implements Command {

    AirConditioner airConditioner;

    public TurnOffAcCommand(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void executeCommand() {
      airConditioner.turnOffAc();
    }

    @Override
    public void undo() {
        airConditioner.turnOnAc();
    }

}