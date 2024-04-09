public class Cleaner extends HospitalEmp{
    private String task;

    public Cleaner(String name, int employeeNum, String task) {
        super(name, employeeNum);
        this.task = task;
    }

    public void task() {
        System.out.println("Cleaner " + name + ", " + employeeNum + ", is " + task);
    }
}
