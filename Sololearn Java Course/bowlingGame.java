import java.util.*; 

public class Bowling {
    HashMap<String, Integer> players;
    Bowling() {
        players = new HashMap<String, Integer>();
    }
    public void addPlayer(String name, int p) {
        players.put(name, p);
    }
    //your code goes here
    public void getWinner(){
        Iterator<String> iterator = players.keySet().iterator();
        /*
        * If HashMap is not empty, get the first key
        * using the next method
        */
        String key = null;
        if(iterator.hasNext()){
            key = iterator.next();
        }
        String maximumPerson = key;
        int maxScore = players.get(maximumPerson).intValue();
        for(String key2:players.keySet()){
            int score = players.get(key2).intValue();
            if(maxScore<score){
                maximumPerson = key2;
                maxScore = score;
            }
        }
        System.out.println(maximumPerson);
    }
}

public class Program {
    public static void main(String[ ] args) {
        Bowling game = new Bowling();
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<3;i++) {
            String input = sc.nextLine();
            String[] values = input.split(" ");
            String name = values[0];
            int points = Integer.parseInt(values[1]);
            game.addPlayer(name, points);
        }
        game.getWinner();
    }
}
