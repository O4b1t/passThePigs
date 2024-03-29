import java.util.ArrayList;

public class GenericBot extends Player {
    //String strategy = "Always Roll";
    public GenericBot(String n) {
        super(n);
        super.strategy = "Always Roll";
    }

    public String getName() {
        return super.getName();
    }

    public String getStrategy() {
        return strategy;
    }

    public boolean wantsToRoll(int myScore, int handScore, ArrayList<Integer> otherScores, int winningScore) {
        
        if (handScore < 30) {
            return true;
        }
        
        return false;
    }
    

}