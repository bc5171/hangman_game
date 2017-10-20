package io.github.bc5171.hangmangame;

/**
 * Created by Ben on 10/20/2017.
 */

public class User {

    private int ID;
    private String onlineID;
    private int totSolved;
    private int totAttempted;

    public User() {}

    public User(int ID) {
        this.ID = ID;
    }

    public User(int ID, String onlineID, int totSolved, int totAttempted) {
        this.ID = ID;
        this.onlineID = onlineID;
        this.totSolved = totSolved;
        this.totAttempted = totAttempted;
    }

    public User(int ID, int totSolved, int totAttempted) {
        this.ID = ID;
        this.totSolved = totSolved;
        this.totAttempted = totAttempted;
    }

    public int getID() {
        return ID;
    }

    public int getTotSolved() {
        return totSolved;
    }

    public int getTotAttempted() {
        return totAttempted;
    }

    public String getOnlineID() {
        return onlineID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setOnlineID(String onlineID) {
        this.onlineID = onlineID;
    }

    public void setTotSolved(int totSolved) {
        this.totSolved = totSolved;
    }

    public void setTotAttempted(int totAttempted) {
        this.totAttempted = totAttempted;
    }

    public int getScore() {
        int score = (totAttempted / totSolved) * 100;
        return score;
    }

}
