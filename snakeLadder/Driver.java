package snakeLadder;

import java.util.*;

public class Driver {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int snakeCount = Integer.parseInt(scanner.nextLine()) ;
        Map<Integer, Integer> snakeMap = new HashMap<>();
        for(int i=0;i<snakeCount;i++) {
            String[] inp = scanner.nextLine().split(" ");
            snakeMap.put( Integer.parseInt( inp[0] ), Integer.parseInt( inp[1] ) );
        }

        int ladderCount = Integer.parseInt(scanner.nextLine()) ;
        Map<Integer, Integer> ladderMap = new HashMap<>();
        for(int i=0;i<ladderCount;i++) {
            String[] inp = scanner.nextLine().split(" ");
            ladderMap.put( Integer.parseInt( inp[0] ), Integer.parseInt( inp[1] ) );
        }
        
        // Passing 100 for now, can be taken dynamically as well
        BoardGame boardGame = new BoardGame( new Board(snakeMap, ladderMap, 100) );

        int userCount = Integer.parseInt(scanner.nextLine()) ;
        for(int i=0;i<userCount;i++) {
            String userName = scanner.nextLine();
            boardGame.addUser(userName);
        }

        boardGame.playGame();
        scanner.close();
    }
}
