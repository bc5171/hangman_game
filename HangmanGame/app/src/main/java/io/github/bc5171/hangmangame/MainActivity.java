package io.github.bc5171.hangmangame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    DBHelper dbhelper;
    private static final String TAG = "BEN";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i(TAG, "Starting the game...");
        dbhelper = new DBHelper(this);
        dbhelper.open();

    }

    public void handleGameBtn(View view) {
        Intent gameIntent = new Intent(this, Game.class);
        Log.i(TAG, "Starting the game activity...");
        startActivity(gameIntent);
    }

    public void handleScoresBtn(View view) {
        Intent scoresIntent = new Intent(this, HighScores.class);
        startActivity(scoresIntent);
    }

    @Override
    protected void onResume() {
        super.onResume();
        dbhelper.open();
    }

    @Override
    protected void onPause() {
        super.onPause();
        dbhelper.close();
    }

}
