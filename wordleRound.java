import java.util.ArrayList;
import java.util.Map;

public class wordleRound {
    private String word;
    private int round;
    private ArrayList<Character> guesses;
    private ArrayList<Character> accuracy;

    public wordleRound(String word){
        this.word = word;
        this.round = 0;
        this.guesses = new ArrayList<Character>();
        this.accuracy = new ArrayList<Character>();
    }

    public char[] guess(String word){
        return null;
    }
    
    public Map.Entry<wordleOutcome, String> roundStatus(){
        return null;
    }
}

enum wordleOutcome{
    WIN,
    LOSE,
    IN_PROGRESS
}
