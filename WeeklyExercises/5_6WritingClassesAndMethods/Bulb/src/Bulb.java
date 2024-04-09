public class Bulb {
    private boolean switchIsOn;
    private String BulbName;

    public Bulb(String BulbName) {
        this.BulbName = BulbName;
        this.switchIsOn = false;
    }

    public void turnOn() {
        this.switchIsOn = true;
        System.out.println(BulbName + " light is switched on.");
    }

    public void turnOff() {
        this.switchIsOn = false;
        System.out.println(BulbName + " light is switched off.");
    }
    public String switchIsOn() {
        if (this.switchIsOn) {
            return (BulbName + " light is on.");
        } else {
            return (BulbName + " light is off.");
        }
    }


}
