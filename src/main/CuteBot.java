import java.util.ArrayList;

public class CuteBot extends Player {
    public CuteBot(String n){
        super(n);
        super.strategy = "Roll until I get a double";
    }

    public String getName() {
        return super.getName();
    }

    public String getStrategy() {
        return strategy;
    }
}