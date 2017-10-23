package io.github.bc5171.hangmangame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Game extends AppCompatActivity {

    Word w;
    DBHelper dbhelper;
    TextView tvWord;
    EditText etGuess;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        tvWord = (TextView)findViewById(R.id.tvHiddenWord);
        etGuess = (EditText)findViewById(R.id.etInput);

        w = dbhelper.getWord();

        if (w == null) {
            retrieveWord();
        }

        etGuess.setText(w.getGuess());
        tvWord.setText(w.getWord());

        maskWord();
    }

    private void clickHandler() {

    }

    private void unmaskWord() {

    }

    private void maskWord() {

    }

    private void retrieveWord() {
        w.setGuess("");
    }
}
