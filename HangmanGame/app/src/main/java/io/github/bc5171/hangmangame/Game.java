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

    // Activity variables
    TextView tvWord;
    Button btnA;
    Button btnB;
    Button btnC;
    Button btnD;
    Button btnE;
    Button btnF;
    Button btnG;
    Button btnH;
    Button btnI;
    Button btnJ;
    Button btnK;
    Button btnL;
    Button btnM;
    Button btnN;
    Button btnO;
    Button btnP;
    Button btnQ;
    Button btnR;
    Button btnS;
    Button btnT;
    Button btnU;
    Button btnV;
    Button btnW;
    Button btnX;
    Button btnY;
    Button btnZ;

    // Variables
    String maskedWord;
    String guess;
    InternalDataStorage datasource;
    Word w;
    DBHelper dbhelper;
    private List<String> alphabetUpper;
    private static final String TAG = "BEN";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        tvWord = (TextView)findViewById(R.id.tvHiddenWord);
        btnA = (Button)findViewById(R.id.btnA);
        btnB = (Button)findViewById(R.id.btnB);
        btnC = (Button)findViewById(R.id.btnC);
        btnD = (Button)findViewById(R.id.btnD);
        btnE = (Button)findViewById(R.id.btnE);
        btnF = (Button)findViewById(R.id.btnF);
        btnG = (Button)findViewById(R.id.btnG);
        btnH = (Button)findViewById(R.id.btnH);
        btnI = (Button)findViewById(R.id.btnI);
        btnJ = (Button)findViewById(R.id.btnJ);
        btnK = (Button)findViewById(R.id.btnK);
        btnL = (Button)findViewById(R.id.btnL);
        btnM = (Button)findViewById(R.id.btnM);
        btnN = (Button)findViewById(R.id.btnN);
        btnO = (Button)findViewById(R.id.btnO);
        btnP = (Button)findViewById(R.id.btnP);
        btnQ = (Button)findViewById(R.id.btnQ);
        btnR = (Button)findViewById(R.id.btnR);
        btnS = (Button)findViewById(R.id.btnS);
        btnT = (Button)findViewById(R.id.btnT);
        btnU = (Button)findViewById(R.id.btnU);
        btnV = (Button)findViewById(R.id.btnV);
        btnW = (Button)findViewById(R.id.btnW);
        btnX = (Button)findViewById(R.id.btnX);
        btnY = (Button)findViewById(R.id.btnY);
        btnZ = (Button)findViewById(R.id.btnZ);

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
                processLetter(btnA);
                btnA.setEnabled(false);
                break;
            case R.id.btnB:
                processLetter(btnB);
                btnB.setEnabled(false);
                break;
            case R.id.btnC:
                processLetter(btnC);
                btnC.setEnabled(false);
                break;
            case R.id.btnD:
                processLetter(btnD);
                btnD.setEnabled(false);
                break;
            case R.id.btnE:
                processLetter(btnE);
                btnE.setEnabled(false);
                break;
            case R.id.btnF:
                processLetter(btnF);
                btnF.setEnabled(false);
                break;
            case R.id.btnG:
                processLetter(btnG);
                btnG.setEnabled(false);
                break;
            case R.id.btnH:
                processLetter(btnH);
                btnH.setEnabled(false);
                break;
            case R.id.btnI:
                processLetter(btnI);
                btnI.setEnabled(false);
                break;
            case R.id.btnJ:
                processLetter(btnJ);
                btnJ.setEnabled(false);
                break;
            case R.id.btnK:
                processLetter(btnK);
                btnK.setEnabled(false);
                break;
            case R.id.btnL:
                processLetter(btnL);
                btnL.setEnabled(false);
                break;
            case R.id.btnM:
                processLetter(btnM);
                btnM.setEnabled(false);
                break;
            case R.id.btnN:
                processLetter(btnN);
                btnN.setEnabled(false);
                break;
            case R.id.btnO:
                processLetter(btnO);
                btnO.setEnabled(false);
                break;
            case R.id.btnP:
                processLetter(btnP);
                btnP.setEnabled(false);
                break;
            case R.id.btnQ:
                processLetter(btnQ);
                btnQ.setEnabled(false);
                break;
            case R.id.btnR:
                processLetter(btnR);
                btnR.setEnabled(false);
                break;
            case R.id.btnS:
                processLetter(btnS);
                btnS.setEnabled(false);
                break;
            case R.id.btnT:
                processLetter(btnT);
                btnT.setEnabled(false);
                break;
            case R.id.btnU:
                processLetter(btnU);
                btnU.setEnabled(false);
                break;
            case R.id.btnV:
                processLetter(btnV);
                btnV.setEnabled(false);
                break;
            case R.id.btnW:
                processLetter(btnW);
                btnW.setEnabled(false);
                break;
            case R.id.btnX:
                processLetter(btnX);
                btnX.setEnabled(false);
                break;
            case R.id.btnY:
                processLetter(btnY);
                btnY.setEnabled(false);
                break;
            case R.id.btnZ:
                processLetter(btnZ);
                btnZ.setEnabled(false);
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
