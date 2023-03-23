import java.util.ArrayList;
import java.util.Collections;

public class Main {
    
    public static void main(String[] args) {
        
        
        String[] teams = {"Team 1", "Team 2", "Team 3", "Team 4", "Team 5"};
        
        
        int numMatches = (teams.length - 1) * 2;
        
        
        ArrayList<String> matches = new ArrayList<String>();
        
        
        for (int round = 1; round <= numMatches; round++) {
            for (int i = 0; i < teams.length; i++) {
                int j = (round + i) % (teams.length - 1);
                if (j == 0) {
                    j = teams.length - 1;
                }
                matches.add(teams[i] + " vs " + teams[j]);
            }
        }
        

        Collections.shuffle(matches);
        
        
        for (int i = 0; i < matches.size(); i++) {
            System.out.println("Match " + (i+1) + ": " + matches.get(i));
        }
    }
}
