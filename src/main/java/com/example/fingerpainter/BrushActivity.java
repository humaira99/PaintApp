package com.example.fingerpainter;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

public class BrushActivity extends AppCompatActivity {

    SeekBar seekBar;
    Bundle bundle = new Bundle();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brush);

        seekBar = findViewById(R.id.seekBar);
        final TextView width = findViewById(R.id.brushWidth);

        Bundle bundle2 = getIntent().getExtras();
        int prog = bundle2.getInt("width");
        if(prog != 0) {
            seekBar.setProgress(prog);
            width.setText(String.valueOf(prog));
        }

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser){
                width.setText(String.valueOf(progress));
                int input = seekBar.getProgress();
                bundle.putInt("width", input);

                Intent result = new Intent();
                result.putExtras(bundle);
                setResult(Activity.RESULT_OK, result);

                finish();

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar){

            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar){

            }
        });
    }

    public void roundPressed(View v){
        String input = "round";
        bundle.putString("myResult", input);

        Intent result = new Intent();
        result.putExtras(bundle);
        setResult(Activity.RESULT_OK, result);

        finish();

    }

    public void squarePressed(View v){
        String input = "square";
        bundle.putString("myResult", input);

        Intent result = new Intent();
        result.putExtras(bundle);
        setResult(Activity.RESULT_OK, result);

        finish();

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("FingerPainter", "Brush Activity onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("FingerPainter", "Brush Activity onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("FingerPainter", "Brush Activity onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("FingerPainter", "Brush Activity onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("FingerPainter", "Brush Activity onResume");
    }
}
