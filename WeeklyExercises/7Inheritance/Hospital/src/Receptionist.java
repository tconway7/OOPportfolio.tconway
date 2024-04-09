

public class Receptionist extends HospitalEmp{
    private int deskNo;

    public Receptionist(String name, int employeeNum, int deskNo) {
        super(name, employeeNum);
        this.deskNo = deskNo;
    }

    public void posted() {
        System.out.println("Receptionist " + name + ", " + employeeNum + ", is posted on desk " + deskNo);
    }
}


