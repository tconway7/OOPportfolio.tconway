

public class Nurse extends HospitalEmp{
    private int NoOfPatients;

    public Nurse(String name, int employeeNum, int NoOfPatients) {
        super(name, employeeNum);
        this.NoOfPatients = NoOfPatients;
    }

    public void treat() {
        System.out.println("Nurse " + name + ", " + employeeNum + ", has " + NoOfPatients + " patients");
    }
}
