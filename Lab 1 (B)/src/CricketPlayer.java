public class CricketPlayer
{
    private String playerName;
    private int score;
    private int ballsPlayed;
    private int numFours;
    private int numSixes;

    // Parameterized Constructor
    public CricketPlayer(String playerName, int score, int ballsPlayed, int numFours, int numSixes)
    {
        this.playerName = playerName;
        this.score = score;
        this.ballsPlayed = ballsPlayed;
        this.numFours = numFours;
        this.numSixes = numSixes;
    }

    // Getter methods
    public String getPlayerName()
    {
        return playerName;
    }

    public int getScore()
    {
        return score;
    }

    public int getBallsPlayed()
    {
        return ballsPlayed;
    }

    public int getNumFours()
    {
        return numFours;
    }

    public int getNumSixes()
    {
        return numSixes;
    }

    // Private method for strike rate
    private double calculateStrikeRate()
    {
        return (score * 100.0) / ballsPlayed;
    }

    // Private method for boundary percentage
    private double calculateBoundaryPercentage()
    {
        return ((numFours + numSixes) * 100.0) / ballsPlayed;
    }

    // Public method to print player information
    public void printPlayerInfo()
    {
        System.out.println("Player Name: " + playerName);
        System.out.println("Total Score: " + score);
        System.out.println("Balls Played: " + ballsPlayed);
        System.out.println("Number of Fours: " + numFours);
        System.out.println("Number of Sixes: " + numSixes);
        System.out.println("Strike Rate: " + String.format("%.2f", calculateStrikeRate()));
        System.out.println("Boundary Percentage: " + String.format("%.2f", calculateBoundaryPercentage()));
    }
}
