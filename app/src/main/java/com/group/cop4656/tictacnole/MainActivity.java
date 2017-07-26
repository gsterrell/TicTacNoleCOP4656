package com.group.cop4656.tictacnole;

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

    public void showPVP(View view) {
        Intent intent = new Intent(this, PVPActivity.class);
        startActivity(intent);
    }

    public void showPVC(View view) {
        Intent intent = new Intent(this, PVCActivity.class);
        startActivity(intent);
    }
}
