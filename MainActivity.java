package com.example.alan.hangmangame;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.BoringLayout;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button btnA, btnB, btnC, btnD, btnE, btnF, btnG, btnH, btnI, btnJ, btnK, btnL, btnM, btnN, btnO, btnP, btnQ, btnR, btnS, btnT, btnU, btnV, btnW, btnX, btnY, btnZ, btnNew;
    private TextView txtDash;
    private boolean[] correctInput;
    Button btnClicked;
    String btnValue;
    Button[] btnlist;
    boolean[] alreadyClicked;
    private TextView txtInput;
    private int[] hangmanImages ={
            R.drawable.h0, R.drawable.h1, R.drawable.h2, R.drawable.h3, R.drawable.h4, R.drawable.h5, R.drawable.h6,

    };
    private ImageView hangman;






    private String[]words = {"APPLE","TURTLE","COFFEE","DREAM","HANGMAN"};
    private String[]hints = {"FRUIT","SEA","STARBUCKS","SLEEP","GAME"};
    Random A = new Random();
    String preSelectedWord = words[A.nextInt(5)];
    String []preSelectedArray = preSelectedWord.split("");





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtDash = (TextView)findViewById(R.id.txtDash);
        txtDash.setText(printDash(preSelectedWord));
        txtInput = (TextView)findViewById(R.id.txtInput);
        hangman = (ImageView)findViewById(R.id.hangman);
        correctInput = new boolean[preSelectedWord.length()+1];
        for(int i = 0;i<preSelectedWord.length();i++){
            correctInput[i]=false;
        }
        alreadyClicked = new boolean[26];
        for(int i = 0;i<26;i++){
            alreadyClicked[i] = false;
        }
        Button btnA = (Button) findViewById(R.id.btnA);
        Button btnB = (Button) findViewById(R.id.btnB);
        Button btnC = (Button) findViewById(R.id.btnC);
        Button btnD = (Button) findViewById(R.id.btnD);
        Button btnE = (Button) findViewById(R.id.btnE);
        Button btnF = (Button) findViewById(R.id.btnF);
        Button btnG = (Button) findViewById(R.id.btnG);
        Button btnH = (Button) findViewById(R.id.btnH);
        Button btnI = (Button) findViewById(R.id.btnI);
        Button btnJ = (Button) findViewById(R.id.btnJ);
        Button btnK = (Button) findViewById(R.id.btnK);
        Button btnL = (Button) findViewById(R.id.btnL);
        Button btnM = (Button) findViewById(R.id.btnM);
        Button btnN = (Button) findViewById(R.id.btnN);
        Button btnO = (Button) findViewById(R.id.btnO);
        Button btnP = (Button) findViewById(R.id.btnP);
        Button btnQ = (Button) findViewById(R.id.btnQ);
        Button btnR = (Button) findViewById(R.id.btnR);
        Button btnS = (Button) findViewById(R.id.btnS);
        Button btnT = (Button) findViewById(R.id.btnT);
        Button btnU = (Button) findViewById(R.id.btnU);
        Button btnV = (Button) findViewById(R.id.btnV);
        Button btnW = (Button) findViewById(R.id.btnW);
        Button btnX = (Button) findViewById(R.id.btnX);
        Button btnY = (Button) findViewById(R.id.btnY);
        Button btnZ = (Button) findViewById(R.id.btnZ);

        btnA.setOnClickListener(onClickListener);
        btnB.setOnClickListener(onClickListener);
        btnC.setOnClickListener(onClickListener);
        btnD.setOnClickListener(onClickListener);
        btnE.setOnClickListener(onClickListener);
        btnF.setOnClickListener(onClickListener);
        btnG.setOnClickListener(onClickListener);
        btnH.setOnClickListener(onClickListener);
        btnI.setOnClickListener(onClickListener);
        btnJ.setOnClickListener(onClickListener);
        btnK.setOnClickListener(onClickListener);
        btnL.setOnClickListener(onClickListener);
        btnM.setOnClickListener(onClickListener);
        btnN.setOnClickListener(onClickListener);
        btnO.setOnClickListener(onClickListener);
        btnP.setOnClickListener(onClickListener);
        btnQ.setOnClickListener(onClickListener);
        btnR.setOnClickListener(onClickListener);
        btnS.setOnClickListener(onClickListener);
        btnT.setOnClickListener(onClickListener);
        btnU.setOnClickListener(onClickListener);
        btnV.setOnClickListener(onClickListener);
        btnW.setOnClickListener(onClickListener);
        btnX.setOnClickListener(onClickListener);
        btnY.setOnClickListener(onClickListener);
        btnZ.setOnClickListener(onClickListener);

        btnlist = new Button[]{
                btnA, btnB, btnC, btnD, btnE, btnF, btnG, btnH, btnI, btnJ, btnK, btnL, btnM, btnN, btnO, btnP, btnQ, btnR, btnS, btnT, btnU, btnV, btnW, btnX, btnY, btnZ
        };

    }

    public String printDash(String x) {
        String result = "";
        for(int i = 0;i < x.length();i++){
            result += "_ ";
        }
        return result;



    }
    public void printInput(){
        StringBuilder input = new StringBuilder();
        for(int i =0;i<preSelectedWord.length();i++){
            if(correctInput[i]){
                input.append(" ");

                input.append(preSelectedArray[i]);
            }
            else{
                input.append("  ");
            }
        }
        txtInput.setText(input.toString());

    }
    public void showCorrectInput(String x){
        for(int i=0;i<preSelectedWord.length();i++){
            if(x.equals(preSelectedArray[i])){
                correctInput[i]=true;
            }
        }
        printInput();
    }
    public final View.OnClickListener onClickListener = new View.OnClickListener(){
        @Override
        public void onClick(View v){
            btnClicked = (Button) v;
            btnValue = btnClicked.getText().toString();
            for(int i =0; i<26;i++){
                if(v==btnlist[i]){
                    alreadyClicked[i] = true;

                }
            }
            btnClicked.setClickable(false);
            btnClicked.setEnabled(false);
            btnClicked.setBackgroundColor(Color.WHITE);

            showCorrectInput(btnValue);





        }

    };
    }

