package engine;

import beans.Color;
import beans.Piece;
import beans.Player;
import beans.Soldier;

import java.util.HashMap;
import java.util.Map;

public class Game {
    private static final Map<Integer, Piece> map = new HashMap<>();
    private final Player player1 = new Player(Color.WHITE);
    private final Player player2 = new Player(Color.BLACK);

    public Game() {
        for (int i = 0, j = map.size(), k = 0, l = 23; i < 24; i+=2, j-=2, k++, l--) {
            // fill all the board up using the id each of the players have
            map.put(i, player1.getPieces()[player1.getPieces()[k].getId()]);
            map.put(j, player2.getPieces()[player2.getPieces()[l].getId()]);
        }
    }

    public boolean isMoveValid(int move){
        if(map.get(move) != null){
            return false;
        }

        return true;
    }

    public void showMap(){

    }
}


// 0 - 0 - 0 - 0 -
// - 0 - 0 - 0 - 0
// 0 - 0 - 0 - 0 -