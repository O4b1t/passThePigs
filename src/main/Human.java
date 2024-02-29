import java.util.*;

public class Human extends Player {
    Scanner in = new Scanner(System.in);
    
    public Human(String n){
        super(n);
    }

    public boolean wantsToRoll(int myScore, int handScore, ArrayList<Integer> otherScores, int winningScore){
        String ans;
        System.out.println("your score is currently: " + myScore);
        System.out.println("your hand score is currently: " + handScore);
        System.out.println("score to win is: " + winningScore);
        System.out.println("Do you want to continue rolling (y/n): ");
        ans = in.nextLine();

        if(ans.equals("y")){
            return true;
        }else{
            return false;
        }
    }
}