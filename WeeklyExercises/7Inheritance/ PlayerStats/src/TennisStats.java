public class TennisStats extends PlayerStats {
    private int points;

    public TennisStats(String name, int studentID, int points) {
        super(name, studentID);
        this.points = points;
    }

    public void NoOfPoints() {
        System.out.println("Tennis player, " + name + ", " + studentID + ", scored " + points + " points.");
    }
}
