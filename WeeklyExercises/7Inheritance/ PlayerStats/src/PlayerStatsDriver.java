public class PlayerStatsDriver {
    public static void main(String[] args) {
        FootballStats Football456 = new FootballStats("John", 456, 14);
        CricketStats Cricket654 = new CricketStats("Biff", 654, 25);
        TennisStats Tennis123 = new TennisStats("Han", 123, 35);

        Cricket654.NoOfRuns();
        Football456.NoOfGoals();
        Tennis123.NoOfPoints();
    }

}
