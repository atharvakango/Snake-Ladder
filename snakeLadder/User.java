package snakeLadder;

public class User {
    private String name;
    private String id;
    private int currLoc=0;
    private boolean won;


    public boolean isWon() {
        return won;
    }
    public void setWon(boolean hasWon) {
        this.won = hasWon;
    }
    public int getcurrLoc() {
        return currLoc;
    }
    public void setcurrLoc(int currLoc) {
        this.currLoc = currLoc;
    }
    public User(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    
}
