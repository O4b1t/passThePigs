import java.util.ArrayList;
import java.util.Collections;

public class WisdomBot extends Player {
    public WisdomBot(String n) {
        super(n);
        super.strategy = "I will try to get reach 21 point every time";
    }

    public String getStrategy() {
        return strategy;
    }

    public String getName() {
        return super.getName();
    }

    public boolean wantsToRoll(int myScore, int handScore, ArrayList<Integer> otherScores, int winningScore) {
        if (myScore < winningScore) {
            if (handScore < 21) {
                return true;
            } else if (Collections.max(otherScores) > 90) {
                return true;
            }
            return false;
        }
        return false;
    }
}
