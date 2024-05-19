package behavioral.Command;

public class AirConditioner {
    boolean isOn;
    Integer temperature;

    public void turnOnAc() {
      this.isOn = true;
      System.out.println("Ac is On");
    }

    public void turnOffAc() {
        this.isOn = false;
        System.out.println("Ac is Off");
    }
}
