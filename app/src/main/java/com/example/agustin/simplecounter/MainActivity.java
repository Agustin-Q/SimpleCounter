package com.example.agustin.simplecounter;

import android.content.Context;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int count = 0;

    public void plusFunction(View view){
        count++;
        TextView display = (TextView) findViewById(R.id.countTextView);
        display.setText(String.valueOf(count));
        Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        v.vibrate(20);


    }

    public void minusFunction(View view){
        count--;
        TextView display = (TextView) findViewById(R.id.countTextView);
        display.setText(String.valueOf(count));
        Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        long[] effect = new long[]{0,20,20,20};
        v.vibrate(effect ,-1);
    }

    public void resetFunction(View view){
        count = 0;
        TextView display = (TextView) findViewById(R.id.countTextView);
        display.setText(String.valueOf(count));
        Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        v.vibrate(500);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
