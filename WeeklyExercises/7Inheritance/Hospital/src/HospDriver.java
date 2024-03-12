

public class HospDriver {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("Dan", 605, "Heart Surgery");
        Nurse nurse = new Nurse("Mark", 705, 30);
        doctor.treat();
        nurse.treat();
    }

}

