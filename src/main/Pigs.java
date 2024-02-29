public class Pigs {
    private final int numOfPigs = 2;
    private double score = 0.0;
    private String[] pigs = new String[numOfPigs];
    //private String[] scores = new String[numOfPigs];
    public Pigs(){

    }

    public String getPig1(){
        return pigs[0];
    }

    public String getPig2(){
        return pigs[1];
    }

    public int roll(){
        score = 0.0;
        for(int i = 0; i < numOfPigs; i++){
            int num = (int)(Math.random() * 1000);
            System.out.println(num);
            if(num<349){
                pigs[i] = "Dot";
                score += 0.25;
            }else if(num<651){
                pigs[i] = "No Dot";
                score += 0.25;
            }else if(num<875){
                pigs[i] = "Razorback";
                score += 5;
            }else if(num<963){
                pigs[i] = "Trotter";
                score += 5;
            }else if(num<993){
                pigs[i] = "Snouter";
                score += 10;
            }else{
                pigs[i] = "Leaning Jowler";
                score += 15;
            } 
        }
        if(pigs[0].equals(pigs[1])){
            return (int)(score * 2);
        }else{
            return (int)(score);
        }
    }
    
}
