import java.util.ArrayList;

public class CuteBot extends Player {
    int cnt = 0;
    public CuteBot(String n) {
        super(n);
        super.strategy = "Roll once every turn because I am cute";
    }

    public String getName() {
        return super.getName();
    }

    public String getStrategy() {
        return strategy;
    }

    public boolean wantsToRoll(int myScore, int handScore, ArrayList<Integer> otherScores, int winningScore){
        if (cnt < 1) {
            return true;
        }
        cnt = 0;
        return false;
    }
}