import java.util.ArrayList;

public class Bot extends Player {
    String strategy = "Always Roll";
    public Bot(String n){
        super(n);
    }

    public String getName(){
        return super.getName();
    }

    public String getStrategy(){
        return this.strategy;
    }

    public boolean wantsToRoll(int myScore, int handScore, ArrayList<Integer> otherScores, int winningScore){
        if(myScore < winningScore){
            if(handScore < 30){
                return true;
            }
        }
        System.out.println(super.getName() + " passes.");
        return false;
    }
    

}