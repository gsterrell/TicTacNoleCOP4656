package com.group.cop4656.tictacnole;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class PVCActivity extends AppCompatActivity {

    int state = R.integer.NOLE_STATE;
    int row1col1Clicked = 0;
    int row1col2Clicked = 0;
    int row1col3Clicked = 0;
    int row2col1Clicked = 0;
    int row2col2Clicked = 0;
    int row2col3Clicked = 0;
    int row3col1Clicked = 0;
    int row3col2Clicked = 0;
    int row3col3Clicked = 0;
    int turnCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pvc);

        TextView currentCondition = (TextView) findViewById(R.id.textCondition);
        currentCondition.setText("It's your turn Nole");
    }

    //Found here: https://stackoverflow.com/questions/3412180/how-to-determine-which-button-pressed-on-android
    //All the code that is really long and redundant because I couldn't figure out a more elegant method: me.
    public void onClick(View v) {
        if (state != R.integer.WIN_STATE) {
            switch (v.getId()) {
                case R.id.pvcrow1col1:
                    if (row1col1Clicked == 0) {
                        if (state == R.integer.NOLE_STATE) {
                            v.setBackgroundResource(R.mipmap.nole);
                            state = R.integer.GATOR_STATE;
                            row1col1Clicked = R.integer.NOLE_STATE;
                            turnCount += 1;
                        }
                    }
                    break;
                case R.id.pvcrow1col2:
                    if (row1col2Clicked == 0) {
                        if (state == R.integer.NOLE_STATE) {
                            v.setBackgroundResource(R.mipmap.nole);
                            state = R.integer.GATOR_STATE;
                            row1col2Clicked = R.integer.NOLE_STATE;
                            turnCount += 1;
                        }
                    }
                    break;
                case R.id.pvcrow1col3:
                    if (row1col3Clicked == 0) {
                        if (state == R.integer.NOLE_STATE) {
                            v.setBackgroundResource(R.mipmap.nole);
                            state = R.integer.GATOR_STATE;
                            row1col3Clicked = R.integer.NOLE_STATE;
                            turnCount += 1;
                        }
                    }
                    break;
                case R.id.pvcrow2col1:
                    if (row2col1Clicked == 0) {
                        if (state == R.integer.NOLE_STATE) {
                            v.setBackgroundResource(R.mipmap.nole);
                            state = R.integer.GATOR_STATE;
                            row2col1Clicked = R.integer.NOLE_STATE;
                            turnCount += 1;
                        }
                    }
                    break;
                case R.id.pvcrow2col2:
                    if (row2col2Clicked == 0) {
                        if (state == R.integer.NOLE_STATE) {
                            v.setBackgroundResource(R.mipmap.nole);
                            state = R.integer.GATOR_STATE;
                            row2col2Clicked = R.integer.NOLE_STATE;
                            turnCount += 1;
                        }
                    }
                    break;
                case R.id.pvcrow2col3:
                    if (row2col3Clicked == 0) {
                        if (state == R.integer.NOLE_STATE) {
                            v.setBackgroundResource(R.mipmap.nole);
                            state = R.integer.GATOR_STATE;
                            row2col3Clicked = R.integer.NOLE_STATE;
                            turnCount += 1;
                        }
                    }
                    break;
                case R.id.pvcrow3col1:
                    if (row3col1Clicked == 0) {
                        if (state == R.integer.NOLE_STATE) {
                            v.setBackgroundResource(R.mipmap.nole);
                            state = R.integer.GATOR_STATE;
                            row3col1Clicked = R.integer.NOLE_STATE;
                            turnCount += 1;
                        }
                    }
                    break;
                case R.id.pvcrow3col2:
                    if (row3col2Clicked == 0) {
                        if (state == R.integer.NOLE_STATE) {
                            v.setBackgroundResource(R.mipmap.nole);
                            state = R.integer.GATOR_STATE;
                            row3col2Clicked = R.integer.NOLE_STATE;
                            turnCount += 1;
                        }
                    }
                    break;
                case R.id.pvcrow3col3:
                    if (row3col3Clicked == 0) {
                        if (state == R.integer.NOLE_STATE) {
                            v.setBackgroundResource(R.mipmap.nole);
                            state = R.integer.GATOR_STATE;
                            row3col3Clicked = R.integer.NOLE_STATE;
                            turnCount += 1;
                        }
                    }
                    break;
                default:
                    throw new RuntimeException("Unknown button ID");
            }
            TextView currentCondition = (TextView) findViewById(R.id.textCondition);
            if (state == R.integer.NOLE_STATE)
                currentCondition.setText("It's your turn Nole");
            else
                currentCondition.setText("It's your turn Gator");
        }
        GameStatusCheck();
        if (state != R.integer.WIN_STATE)
            ComputerTurn();
    }

    public void GameStatusCheck() {
        if ((row1col1Clicked == R.integer.NOLE_STATE && row1col2Clicked == R.integer.NOLE_STATE && row1col3Clicked == R.integer.NOLE_STATE) ||
                (row2col1Clicked == R.integer.NOLE_STATE && row2col2Clicked == R.integer.NOLE_STATE && row2col3Clicked == R.integer.NOLE_STATE) ||
                (row3col1Clicked == R.integer.NOLE_STATE && row3col2Clicked == R.integer.NOLE_STATE && row3col3Clicked == R.integer.NOLE_STATE) ||
                (row1col1Clicked == R.integer.NOLE_STATE && row2col1Clicked == R.integer.NOLE_STATE && row3col1Clicked == R.integer.NOLE_STATE) ||
                (row1col2Clicked == R.integer.NOLE_STATE && row2col2Clicked == R.integer.NOLE_STATE && row3col2Clicked == R.integer.NOLE_STATE) ||
                (row3col1Clicked == R.integer.NOLE_STATE && row3col2Clicked == R.integer.NOLE_STATE && row3col3Clicked == R.integer.NOLE_STATE) ||
                (row1col1Clicked == R.integer.NOLE_STATE && row2col2Clicked == R.integer.NOLE_STATE && row3col3Clicked == R.integer.NOLE_STATE) ||
                (row1col3Clicked == R.integer.NOLE_STATE && row2col2Clicked == R.integer.NOLE_STATE && row3col1Clicked == R.integer.NOLE_STATE)) {
            state = R.integer.WIN_STATE;
            TextView currentCondition = (TextView) findViewById(R.id.textCondition);
            currentCondition.setText("Noles win!");
        } else if ((row1col1Clicked == R.integer.GATOR_STATE && row1col2Clicked == R.integer.GATOR_STATE && row1col3Clicked == R.integer.GATOR_STATE) ||
                (row2col1Clicked == R.integer.GATOR_STATE && row2col2Clicked == R.integer.GATOR_STATE && row2col3Clicked == R.integer.GATOR_STATE) ||
                (row3col1Clicked == R.integer.GATOR_STATE && row3col2Clicked == R.integer.GATOR_STATE && row3col3Clicked == R.integer.GATOR_STATE) ||
                (row1col1Clicked == R.integer.GATOR_STATE && row2col1Clicked == R.integer.GATOR_STATE && row3col1Clicked == R.integer.GATOR_STATE) ||
                (row1col2Clicked == R.integer.GATOR_STATE && row2col2Clicked == R.integer.GATOR_STATE && row3col2Clicked == R.integer.GATOR_STATE) ||
                (row3col1Clicked == R.integer.GATOR_STATE && row3col2Clicked == R.integer.GATOR_STATE && row3col3Clicked == R.integer.GATOR_STATE) ||
                (row1col1Clicked == R.integer.GATOR_STATE && row2col2Clicked == R.integer.GATOR_STATE && row3col3Clicked == R.integer.GATOR_STATE) ||
                (row1col3Clicked == R.integer.GATOR_STATE && row2col2Clicked == R.integer.GATOR_STATE && row3col1Clicked == R.integer.GATOR_STATE)) {
            state = R.integer.WIN_STATE;
            TextView currentCondition = (TextView) findViewById(R.id.textCondition);
            currentCondition.setText("Gators win!");
        }
        //If all spaces filled and no winner, it's a draw.
        else if (turnCount == 9) {
            state = R.integer.WIN_STATE;
            TextView currentCondition = (TextView) findViewById(R.id.textCondition);
            currentCondition.setText("It's a draw");
        }
    }

    public void ComputerTurn() {
        //Runnable info from here: https://stackoverflow.com/questions/3072173/how-to-call-a-method-after-a-delay-in-android
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {

            @Override
            public void run() {
                /*Keeping for reference
                if (state == R.integer.GATOR_STATE) {
                    //Moves computer should do when it is possible for a winning line
                    //Winning move on row 1
                    if (row1col1Clicked != 0 && row1col2Clicked != 0 && row1col3Clicked == 0)
                        r1c3CompPlayed();
                    else if (row1col1Clicked != 0 && row1col3Clicked != 0 && row1col2Clicked == 0)
                        r1c2CompPlayed();

                }*/
            }
        }, 500);
        GameStatusCheck();
        if (state != R.integer.WIN_STATE) {
            TextView currentCondition = (TextView) findViewById(R.id.textCondition);
            currentCondition.setText("It's your turn Nole");
        }
    }

    public void r1c1CompPlayed() {
        //From here, but also from other sites: https://stackoverflow.com/questions/4009392/how-to-dynamically-change-a-pressed-button-background-color
        Button test = (Button) findViewById(R.id.pvcrow1col1);
        test.performClick();
        test.setBackgroundResource(R.mipmap.gator);
        state = R.integer.NOLE_STATE;
        row1col1Clicked = R.integer.GATOR_STATE;
        turnCount += 1;
    }

    public void r1c2CompPlayed() {
        Button test = (Button) findViewById(R.id.pvcrow1col2);
        test.performClick();
        test.setBackgroundResource(R.mipmap.gator);
        state = R.integer.NOLE_STATE;
        row1col2Clicked = R.integer.GATOR_STATE;
        turnCount += 1;
    }

    public void r1c3CompPlayed() {
        Button test = (Button) findViewById(R.id.pvcrow1col3);
        test.performClick();
        test.setBackgroundResource(R.mipmap.gator);
        state = R.integer.NOLE_STATE;
        row1col3Clicked = R.integer.GATOR_STATE;
        turnCount += 1;
    }

    public void r2c1CompPlayed() {
        Button test = (Button) findViewById(R.id.pvcrow2col1);
        test.performClick();
        test.setBackgroundResource(R.mipmap.gator);
        state = R.integer.NOLE_STATE;
        row2col1Clicked = R.integer.GATOR_STATE;
        turnCount += 1;
    }

    public void r2c2CompPlayed() {
        Button test = (Button) findViewById(R.id.pvcrow2col2);
        test.performClick();
        test.setBackgroundResource(R.mipmap.gator);
        state = R.integer.NOLE_STATE;
        row2col2Clicked = R.integer.GATOR_STATE;
        turnCount += 1;
    }

    public void r2c3CompPlayed() {
        Button test = (Button) findViewById(R.id.pvcrow2col3);
        test.performClick();
        test.setBackgroundResource(R.mipmap.gator);
        state = R.integer.NOLE_STATE;
        row2col3Clicked = R.integer.GATOR_STATE;
        turnCount += 1;
    }

    public void r3c1CompPlayed() {
        Button test = (Button) findViewById(R.id.pvcrow3col1);
        test.performClick();
        test.setBackgroundResource(R.mipmap.gator);
        state = R.integer.NOLE_STATE;
        row3col1Clicked = R.integer.GATOR_STATE;
        turnCount += 1;
    }

    public void r3c2CompPlayed() {
        Button test = (Button) findViewById(R.id.pvcrow3col2);
        test.performClick();
        test.setBackgroundResource(R.mipmap.gator);
        state = R.integer.NOLE_STATE;
        row3col2Clicked = R.integer.GATOR_STATE;
        turnCount += 1;
    }

    public void r3c3CompPlayed() {
        Button test = (Button) findViewById(R.id.pvcrow3col3);
        test.performClick();
        test.setBackgroundResource(R.mipmap.gator);
        state = R.integer.NOLE_STATE;
        row3col3Clicked = R.integer.GATOR_STATE;
        turnCount += 1;
    }

    public void OnPlayAgain(View v) {
        finish();
        startActivity(getIntent());
    }
}

