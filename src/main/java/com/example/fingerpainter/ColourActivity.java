package com.example.fingerpainter;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class ColourActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colour);
    }

    public void press1(View v){
        int input = Color.BLACK;
        Bundle bundle = new Bundle();
        bundle.putInt("myResult", input);

        Intent result = new Intent();
        result.putExtras(bundle);
        setResult(Activity.RESULT_OK, result);

        finish();
    }

    public void press2(View v){
        int input = Color.CYAN;
        Bundle bundle = new Bundle();
        bundle.putInt("myResult", input);

        Intent result = new Intent();
        result.putExtras(bundle);
        setResult(Activity.RESULT_OK, result);

        finish();
    }

    public void press3(View v){
        int input = Color.RED;
        Bundle bundle = new Bundle();
        bundle.putInt("myResult", input);

        Intent result = new Intent();
        result.putExtras(bundle);
        setResult(Activity.RESULT_OK, result);

        finish();
    }

    public void press4(View v){
        int input = Color.GREEN;
        Bundle bundle = new Bundle();
        bundle.putInt("myResult", input);

        Intent result = new Intent();
        result.putExtras(bundle);
        setResult(Activity.RESULT_OK, result);

        finish();
    }

    public void press5(View v){
        int input = Color.YELLOW;
        Bundle bundle = new Bundle();
        bundle.putInt("myResult", input);

        Intent result = new Intent();
        result.putExtras(bundle);
        setResult(Activity.RESULT_OK, result);

        finish();
    }

    public void press6(View v){
        int input = Color.MAGENTA;
        Bundle bundle = new Bundle();
        bundle.putInt("myResult", input);

        Intent result = new Intent();
        result.putExtras(bundle);
        setResult(Activity.RESULT_OK, result);

        finish();
    }

    public void press7(View v){
        int input = Color.GRAY;
        Bundle bundle = new Bundle();
        bundle.putInt("myResult", input);

        Intent result = new Intent();
        result.putExtras(bundle);
        setResult(Activity.RESULT_OK, result);

        finish();
    }

    public void press8(View v){
        int input = Color.WHITE;
        Bundle bundle = new Bundle();
        bundle.putInt("myResult", input);

        Intent result = new Intent();
        result.putExtras(bundle);
        setResult(Activity.RESULT_OK, result);

        finish();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("FingerPainter", "Colour Activity onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("FingerPainter", "Colour Activity onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("FingerPainter", "Colour Activity onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("FingerPainter", "Colour Activity onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("FingerPainter", "Colour Activity onResume");
    }

}
