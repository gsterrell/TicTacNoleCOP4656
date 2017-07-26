package com.group.cop4656.tictacnole;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class PVPActivity extends AppCompatActivity {

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
        setContentView(R.layout.activity_pvp);

        TextView currentCondition = (TextView) findViewById(R.id.textCondition);
        currentCondition.setText("It's your turn Nole");
    }

    //Found here: https://stackoverflow.com/questions/3412180/how-to-determine-which-button-pressed-on-android
    public void onClick(View v) {
        if (state != R.integer.WIN_STATE) {
            switch (v.getId()) {
                case R.id.pvprow1col1:
                    if (row1col1Clicked == 0) {
                        if (state == R.integer.NOLE_STATE) {
                            v.setBackgroundResource(R.mipmap.nole);
                            state = R.integer.GATOR_STATE;
                            row1col1Clicked = R.integer.NOLE_STATE;
                        } else {
                //            v.setBackgroundResource(R.mipmap.gator);
                            state = R.integer.NOLE_STATE;
                            row1col1Clicked = R.integer.GATOR_STATE;
                        }
                        turnCount += 1;
                    }
                    break;
                case R.id.pvprow1col2:
                    if (row1col2Clicked == 0) {
                        if (state == R.integer.NOLE_STATE) {
                            v.setBackgroundResource(R.mipmap.nole);
                            state = R.integer.GATOR_STATE;
                            row1col2Clicked = R.integer.NOLE_STATE;
                        } else {
                  //          v.setBackgroundResource(R.mipmap.gator);
                            state = R.integer.NOLE_STATE;
                            row1col2Clicked = R.integer.GATOR_STATE;
                        }
                        turnCount += 1;
                    }
                    break;
                case R.id.pvprow1col3:
                    if (row1col3Clicked == 0) {
                        if (state == R.integer.NOLE_STATE) {
                            v.setBackgroundResource(R.mipmap.nole);
                            state = R.integer.GATOR_STATE;
                            row1col3Clicked = R.integer.NOLE_STATE;
                        } else {
                    //        v.setBackgroundResource(R.mipmap.gator);
                            state = R.integer.NOLE_STATE;
                            row1col3Clicked = R.integer.GATOR_STATE;
                        }
                        turnCount += 1;
                    }
                    break;
                case R.id.pvprow2col1:
                    if (row2col1Clicked == 0) {
                        if (state == R.integer.NOLE_STATE) {
                            v.setBackgroundResource(R.mipmap.nole);
                            state = R.integer.GATOR_STATE;
                            row2col1Clicked = R.integer.NOLE_STATE;
                        } else {
                      //      v.setBackgroundResource(R.mipmap.gator);
                            state = R.integer.NOLE_STATE;
                            row2col1Clicked = R.integer.GATOR_STATE;
                        }
                        turnCount += 1;
                    }
                    break;
                case R.id.pvprow2col2:
                    if (row2col2Clicked == 0) {
                        if (state == R.integer.NOLE_STATE) {
                            v.setBackgroundResource(R.mipmap.nole);
                            state = R.integer.GATOR_STATE;
                            row2col2Clicked = R.integer.NOLE_STATE;
                        } else {
                        //    v.setBackgroundResource(R.mipmap.gator);
                            state = R.integer.NOLE_STATE;
                            row2col2Clicked = R.integer.GATOR_STATE;
                        }
                        turnCount += 1;
                    }
                    break;
                case R.id.pvprow2col3:
                    if (row2col3Clicked == 0) {
                        if (state == R.integer.NOLE_STATE) {
                            v.setBackgroundResource(R.mipmap.nole);
                            state = R.integer.GATOR_STATE;
                            row2col3Clicked = R.integer.NOLE_STATE;
                        } else {
                          //  v.setBackgroundResource(R.mipmap.gator);
                            state = R.integer.NOLE_STATE;
                            row2col3Clicked = R.integer.GATOR_STATE;
                        }
                        turnCount += 1;
                    }
                    break;
                case R.id.pvprow3col1:
                    if (row3col1Clicked == 0) {
                        if (state == R.integer.NOLE_STATE) {
                            v.setBackgroundResource(R.mipmap.nole);
                            state = R.integer.GATOR_STATE;
                            row3col1Clicked = R.integer.NOLE_STATE;
                        } else {
                            //v.setBackgroundResource(R.mipmap.gator);
                            state = R.integer.NOLE_STATE;
                            row3col1Clicked = R.integer.GATOR_STATE;
                        }
                        turnCount += 1;
                    }
                    break;
                case R.id.pvprow3col2:
                    if (row3col2Clicked == 0) {
                        if (state == R.integer.NOLE_STATE) {
                            v.setBackgroundResource(R.mipmap.nole);
                            state = R.integer.GATOR_STATE;
                            row3col2Clicked = R.integer.NOLE_STATE;
                        } else {
                            //v.setBackgroundResource(R.mipmap.gator);
                            state = R.integer.NOLE_STATE;
                            row3col2Clicked = R.integer.GATOR_STATE;
                        }
                        turnCount += 1;
                    }
                    break;
                case R.id.pvprow3col3:
                    if (row3col3Clicked == 0) {
                        if (state == R.integer.NOLE_STATE) {
                            v.setBackgroundResource(R.mipmap.nole);
                            state = R.integer.GATOR_STATE;
                            row3col3Clicked = R.integer.NOLE_STATE;
                        } else {
                            //v.setBackgroundResource(R.mipmap.gator);
                            state = R.integer.NOLE_STATE;
                            row3col3Clicked = R.integer.GATOR_STATE;
                        }
                        turnCount += 1;
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
    }

    public void GameStatusCheck() {
        if ((row1col1Clicked == R.integer.NOLE_STATE && row1col2Clicked == R.integer.NOLE_STATE && row1col3Clicked == R.integer.NOLE_STATE) ||
                (row2col1Clicked == R.integer.NOLE_STATE && row2col2Clicked == R.integer.NOLE_STATE && row2col3Clicked == R.integer.NOLE_STATE) ||
                (row3col1Clicked == R.integer.NOLE_STATE && row3col2Clicked == R.integer.NOLE_STATE && row3col3Clicked == R.integer.NOLE_STATE) ||
                (row1col1Clicked == R.integer.NOLE_STATE && row2col1Clicked == R.integer.NOLE_STATE && row3col1Clicked == R.integer.NOLE_STATE) ||
                (row1col2Clicked == R.integer.NOLE_STATE && row2col2Clicked == R.integer.NOLE_STATE && row3col2Clicked == R.integer.NOLE_STATE) ||
                (row1col2Clicked == R.integer.NOLE_STATE && row2col2Clicked == R.integer.NOLE_STATE && row3col2Clicked == R.integer.NOLE_STATE) ||
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

    public void OnPlayAgain(View v) {
        finish();
        startActivity(getIntent());
    }
}

