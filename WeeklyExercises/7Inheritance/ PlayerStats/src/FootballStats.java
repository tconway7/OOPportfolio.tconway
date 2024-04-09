public class FootballStats extends PlayerStats{
    private int goals;

    public FootballStats(String name, int studentID, int goals) {
        super(name, studentID);
        this.goals = goals;
    }

    public void NoOfGoals() {
        System.out.println("Football player, " + name + ", " + studentID + ", scored " + goals + " goals.");
    }
}
