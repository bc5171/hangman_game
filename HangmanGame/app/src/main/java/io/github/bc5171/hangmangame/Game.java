package io.github.bc5171.hangmangame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Game extends AppCompatActivity {

    Word w;
    DBHelper dbhelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        w = dbhelper.getWord();

        if (w == null) {
            retrieveWord();
        }
    }


    private void retrieveWord() {

    }
}
