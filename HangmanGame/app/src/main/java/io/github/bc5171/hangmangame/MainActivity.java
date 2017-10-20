package io.github.bc5171.hangmangame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void handleGameBtn(View view) {
        Intent gameIntent = new Intent(this, Game.class);
        startActivity(gameIntent);
    }

    public void handleScoresBtn(View view) {
        Intent scoresIntent = new Intent(this, HighScores.class);
        startActivity(scoresIntent);
    }
}
