package Player;

import java.util.LinkedList;

public abstract class Player {
    boolean white;
    LinkedList<String> moves = new LinkedList<>();

    Player(boolean c){
        white = c;
    }
}
