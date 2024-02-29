import java.util.*;

public class PassThePigs{

    static void printScoreBoard(ArrayList<Player> p, ArrayList<Integer> s){
        for(int i = 0; i < p.size(); i++){
            System.out.print(p.get(i).getName() + ": " + s.get(i) + " |");
        }
        System.out.println();
    }
    public static void main(String[] args){
        final int winningScore = 100;
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> scores = new ArrayList<>();
        Pigs pig = new Pigs();
        boolean gameOn = true;
        System.out.println("Welcome come to Pass the Pigs!");
        ArrayList<Player> players = new ArrayList<>();
        players.add(new Bot("GenericBot"));
        scores.add(0);
        players.add(new Human("Stanley"));
        scores.add(0);
        players.add(new Bot("CowardBot"));
        scores.add(0);
        
        while(gameOn) {
            for(int i = 0; i < players.size(); i++){
                printScoreBoard(players, scores);
                int handScore = 0;
                while((players.get(i)).wantsToRoll(scores.get(i), handScore, scores, winningScore)){
                    int point = pig.roll();
                    if(point != 0){
                        handScore += point;
                        System.out.println(players.get(i).getName() + " rolls a " + pig.getPig1() + " and a " + pig.getPig2() + " for a roll of " + point + ". Handscore is now " + handScore + ".");
                    } else {
                        handScore = 0;
                        System.out.println(players.get(i).getName() + " rolls a " + pig.getPig1() + " and a " + pig.getPig2() + " for a roll of " + point + ". Handscore is now " + handScore + ".");
                        System.out.println("Pig Out!");
                        break;
                    }
                }
                System.out.println("---------------------------------------------------------------------------------------------------------");
                scores.set(i, scores.get(i) + handScore);
                if(scores.get(i) >= winningScore){
                    gameOn = false;
                    System.out.println(players.get(i).getName() + " won!");
                    return;
                }
            }
        
        }

        

        
    }
}