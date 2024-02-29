import java.util.ArrayList;

public class Player {
    private String name;
    protected String strategy;
    public Player(String n) {
        name = n;
    }

    public boolean wantsToRoll(int myScore, int handScore, ArrayList<Integer> otherScores, int winningScore) {
        return true;
    }

    public String getName() {
        return name;
    }

    public String getStrategy() {
        return strategy;
    }

}