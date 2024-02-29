import java.util.ArrayList;

public class CowardBot extends Player {
    int cnt = 0;
    public CowardBot(String n) {
        super(n);
        super.strategy = "3 Is My Luck Number";
    
    }

    public String getName() {
        return super.getName();
    }

    public String getStrategy() {
        return strategy;
    }

    public boolean wantsToRoll(int myScore, int handScore, ArrayList<Integer> otherScores, int winningScore) {
        if (myScore < winningScore) {
            if (cnt < 3) {
                cnt++;
                return true;
            }
        }
        cnt = 0;
        return false;
    }
}
