package snakeLadder;

import java.util.*;

public class BoardGame {
    
    List<User> userList = new LinkedList<>();
    Board board;
    Map<String, User> userMap = new HashMap<>();
    
    
    public BoardGame(Board board) {
        this.board = board;
    }

    public void addUser(String name) {
        User user = new User(name);
        userList.add( user);
        userMap.put(name, user);
    }

    public void playGame() {
        // Vector<Integer> game = new Vector<Integer>();

        boolean reachedEnd=false;
        User winner=null;

        List<User> winnerList = new LinkedList<>();

        while(!reachedEnd) {
            
            for(User user: this.userList) {
                
                int randomInt = getRandomNumber(1, 7);

                
                int src = user.getcurrLoc();
                int dest = user.getcurrLoc() + randomInt;

                System.out.print(user.getName() + " rolled a " + randomInt + " and moved from " + src);

                if(dest > this.board.size) {
                    System.out.println(" to nowhere!");
                    continue;
                }

                
                if( this.board.snake.containsKey(dest) ) {
                    System.out.print(" but landed on " + dest + " and was eaten by a snake! so moved");
                    dest = this.board.snake.get(dest);
                }
                
                if( this.board.ladder.containsKey(dest) ) {
                    System.out.print(" and landed on " + dest + " and found a ladder! so moved");
                    dest = this.board.ladder.get(dest);
                }
                

                user.setcurrLoc(dest);
                System.out.println(" to " + dest);


                if(user.getcurrLoc() == this.board.size) {
                    winner = user;
                    System.out.println(winner.getName() + " Wins the game");
                    winnerList.add(winner);
                    this.userList.remove(winner);

                    if(userList.size() <= 1) {
                        reachedEnd = true;
                        break;
                    }
                    System.out.println("But the show must go on!");
                }
            }
        }
        System.out.println( " The List of winners in sequence: ");
        for(User curWinner: winnerList) {
            System.out.println(curWinner.getName());
        }
        

    }

    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
}