package io.github.bc5171.hangmangame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;

public class Game extends AppCompatActivity {

    Word w;
    DBHelper dbhelper;
    TextView tvWord;
    String maskedWord;
    String guess;
    InternalDataStorage datasource;
    Button btnA;

    private List<String> alphabetUpper;

    private static final String TAG = "BEN";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        tvWord = (TextView)findViewById(R.id.tvHiddenWord);
        btnA = (Button)findViewById(R.id.btnA);

        dbhelper = new DBHelper(this);
        dbhelper.open();

        alphabetUpper = createAlphabetList();

        Log.i(TAG, "Now in the game activity class...");
        w = dbhelper.getWord();

        Log.i(TAG, "Got pass the getWord() method...");
        if (w.getWord() == "") {
            Log.i(TAG, "Setting up temp word...");
            w.setGuess("");
            w.setWord("Test");
            //retrieveWord();
        }

        maskWord();
        tvWord.setText(maskedWord);

    }

    public void processLetter(Button btn) {
        String letter = btn.getText().toString();
        Log.i(TAG, "Btn: " + letter);

    }

    public void handleButton(View view) {
        switch(view.getId()){
            case R.id.btnA:

                btnA.setEnabled(false);
                break;
            case R.id.btnB:
                break;
            case R.id.btnC:
                break;
            case R.id.btnD:
                break;
            case R.id.btnE:
                break;
            case R.id.btnF:
                break;
            case R.id.btnG:
                break;
            case R.id.btnH:
                break;
            case R.id.btnI:
                break;
            case R.id.btnJ:
                break;
            case R.id.btnK:
                break;
            case R.id.btnL:
                break;
            case R.id.btnM:
                break;
            case R.id.btnN:
                break;
            case R.id.btnO:
                break;
            case R.id.btnP:
                break;
            case R.id.btnQ:
                break;
            case R.id.btnR:
                break;
            case R.id.btnS:
                break;
            case R.id.btnT:
                break;
            case R.id.btnU:
                break;
            case R.id.btnV:
                break;
            case R.id.btnW:
                break;
            case R.id.btnX:
                break;
            case R.id.btnY:
                break;
            case R.id.btnZ:
                break;
        }
    }

    private void maskWord() {
        char[] charArayWord = w.getWord().toCharArray();
        maskedWord = "";
        for (Character a : charArayWord) {
            maskedWord = maskedWord + "*";
        }
    }

    private List<String> createAlphabetList() {
        List<String> alphabet = new ArrayList<String>();
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        for (Character a : letters.toCharArray()) {
            alphabet.add(Character.toString(a));
        }

        return alphabet;
    }

    private void retrieveWord() {
        w.setGuess("");
    }
}
