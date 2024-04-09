

public class HospDriver {
    public static void main(String[] args) {
        Doctor doctor605 = new Doctor("Dan", 605, "Heart Surgery");
        Nurse nurse705 = new Nurse("Mark", 705, 30);
        Cleaner cleaner555 = new Cleaner("Ben", 555, "sweeping");
        Receptionist receptionist333 = new Receptionist("Ant", 333, 5);
        doctor605.treat();
        nurse705.patients();
        cleaner555.task();
        receptionist333.posted();
    }

}

