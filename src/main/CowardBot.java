import java.util.ArrayList;

public class CowardBot extends Player {
    //String strategy;
    
    public CowardBot(String n){
        super(n);
        super.strategy = "3 Is My Luck Number";
    
    }

    public String getName(){
        return super.getName();
    }

    public String getStrategy(){
        return strategy;
    }

    public boolean wantsToRoll(int myScore, int handScore, ArrayList<Integer> otherScores, int winningScore){
        int cnt = 0;
        if(myScore < winningScore){
            if(cnt < 3){
                cnt++;
                return true;
            }
        }
        System.out.println(super.getName() + " passes.");
        return false;
    }
}
