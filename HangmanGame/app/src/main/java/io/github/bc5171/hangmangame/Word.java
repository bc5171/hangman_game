package io.github.bc5171.hangmangame;

/**
 * Created by Ben on 10/20/2017.
 */

public class Word {

    private int ID;
    private String word;

    public Word() {}

    public Word(int ID) {
        this.ID = ID;
    }

    public Word(int ID, String word) {
        this.ID = ID;
        this.word = word;
    }

    public int getID() {
        return ID;
    }

    public String getWord() {
        return word;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setWord(String word) {
        this.word = word;
    }

}
