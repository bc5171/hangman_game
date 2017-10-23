package io.github.bc5171.hangmangame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Game extends AppCompatActivity {

    Word w;
    DBHelper dbhelper;
    TextView tvWord;
    EditText etGuess;
    String maskedWord;
    String guess;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        tvWord = (TextView)findViewById(R.id.tvHiddenWord);
        etGuess = (EditText)findViewById(R.id.etInput);

        w = dbhelper.getWord();

        if (w == null) {
            w.setGuess("");
            w.setWord("Test");
            //retrieveWord();
        }

        etGuess.setText(w.getGuess());
        maskWord();
        tvWord.setText(maskedWord);

    }

    public void clickHandler() {
        guess = etGuess.getText().toString();
        String word = unmaskWord();
        if (guess.equals(word)) {
            Toast.makeText(getApplicationContext(), "Congrats! You've guessed the word!", Toast.LENGTH_SHORT).show();
        }
    }

    private String unmaskWord() {
        char[] guess = etGuess.getText().toString().toCharArray();
        char[] word = w.getWord().toCharArray();

        int x = 0;
        for (Character a : guess) {
            for (Character b : word) {
                if (a == b) {
                    guess[x] = b;
                }
            }
            x++;
        }

        String wholeWord = word.toString();
        return wholeWord;
    }

    private void maskWord() {
        char[] charArayWord = w.getWord().toCharArray();
        maskedWord = "";
        for (Character a : charArayWord) {
            maskedWord = maskedWord + "*";
        }
    }

    private void retrieveWord() {
        w.setGuess("");
    }
}
