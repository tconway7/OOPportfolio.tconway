public class CricketStats extends PlayerStats{
    private int runs;

    public CricketStats(String name, int studentID, int runs) {
        super(name, studentID);
        this.runs = runs;
    }

    public void NoOfRuns() {
        System.out.println("Cricket player, " + name + ", " + studentID + ", scored " + runs + " runs.");
    }
}
