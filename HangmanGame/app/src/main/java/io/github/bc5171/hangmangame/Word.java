package io.github.bc5171.hangmangame;

/**
 * Created by Ben on 10/20/2017.
 */

public class Word {

    private int ID;
    private String word;
    private String guess;
    private int strikes;

    public Word() {}

    public Word(int ID) {
        this.ID = ID;
    }

    public Word(int ID, String word) {
        this.ID = ID;
        this.word = word;
    }

    public Word(int ID, String word, String guess, int strikes) {
        this.ID = ID;
        this.word = word;
        this.guess = guess;
        this.strikes = strikes;
    }

    public int getID() {
        return ID;
    }

    public String getWord() { return word; }

    public String getGuess() { return  guess; }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public void setGuess(String guess) {
        this.guess = guess;
    }

    public void setStrikes(int strikes) { this.strikes = strikes; }

    public int getStrikes() { return strikes; }

}
