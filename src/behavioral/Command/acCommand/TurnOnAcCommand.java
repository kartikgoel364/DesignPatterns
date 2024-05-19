package behavioral.Command.acCommand;

import behavioral.Command.AirConditioner;
import behavioral.Command.Command;

public class TurnOnAcCommand implements Command {

    AirConditioner airConditioner;

    public TurnOnAcCommand(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void executeCommand() {
      airConditioner.turnOnAc();
    }

    @Override
    public void undo() {
        airConditioner.turnOffAc();
    }
}
