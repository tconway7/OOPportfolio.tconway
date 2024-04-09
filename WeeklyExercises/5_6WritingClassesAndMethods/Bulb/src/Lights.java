
public class Lights {
    public static void main(String[] args) {
        Bulb bulb1 = new Bulb("Bedroom");
        Bulb bulb2 = new Bulb("Bathroom");
        Bulb bulb3 = new Bulb("Kitchen");

        bulb1.turnOn();
        bulb2.turnOn();

        System.out.println(bulb1.switchIsOn());

    }
}

