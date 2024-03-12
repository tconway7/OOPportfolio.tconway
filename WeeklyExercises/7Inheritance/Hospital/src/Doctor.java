

public class Doctor extends HospitalEmp {
    private String specialism;

    public Doctor(String name, int employeeNum, String specialism) {
        super(name, employeeNum);
        this.specialism = specialism;
    }

    public void treat() {
        System.out.println("Doctor " + name + ", " + employeeNum + ", specialises in " + specialism);
    }
}
