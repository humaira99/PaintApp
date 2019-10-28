package com.example.fingerpainter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FingerPainterView fpv = findViewById(R.id.myFingerPainterView);
        fpv.load(getIntent().getData());
    }

    static final int COLOR_REQUEST_CODE = 1;
    static final int BRUSH_REQUEST_CODE = 2;
    Bundle bundle2 = new Bundle();

    public void colourPressed(View v){
        // opens colour palette so user can select brush colour
        Intent intent = new Intent(MainActivity.this, ColourActivity.class);
        startActivityForResult(intent, COLOR_REQUEST_CODE);
    }

    public void brushPressed(View v){
        // opens activity which allows user to select shape of brush
        Intent intent = new Intent(MainActivity.this, BrushActivity.class);
        intent.putExtras(bundle2);
        startActivityForResult(intent, BRUSH_REQUEST_CODE);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {

        super.onActivityResult(requestCode, resultCode, data);
        FingerPainterView fpv = findViewById(R.id.myFingerPainterView);

        // if colour button was pressed, gets colour selected and sets colour of brush
        if (requestCode == COLOR_REQUEST_CODE) {
            if (resultCode == RESULT_OK) {
                Bundle bundle = data.getExtras();
                int result = bundle.getInt("myResult");
                Log.d("g53mdp", "MainActivity ok " + result);
                fpv.setColour(result);
            }

        }
        // if brush button was pressed, gets shape or size of brush selected and changes brush
        if (requestCode == BRUSH_REQUEST_CODE) {
            if (resultCode == RESULT_OK) {

                Bundle bundle = data.getExtras();
                String brresult = bundle.getString("myResult");
                int width = bundle.getInt("width");
                Log.d("brush", "" + width);

                if(width == 0) {
                    fpv.setBrushWidth(fpv.getBrushWidth());
                }
                else{
                    fpv.setBrushWidth(width);
                    bundle2.putInt("width", width);
                }
                if(brresult != null) {
                    if (brresult.equals("round")) {
                        fpv.setBrush(Paint.Cap.ROUND);
                    }
                    if (brresult.equals("square")) {
                        fpv.setBrush(Paint.Cap.SQUARE);
                    }
                }


            }
            if(resultCode == RESULT_CANCELED){
                Log.d("fingerPainter", "MainActivity canceled");
            }
        }

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("FingerPainter", "Main Activity onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("FingerPainter", "Main Activity onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("FingerPainter", "Main Activity onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("FingerPainter", "Main Activity onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("FingerPainter", "Main Activity onResume");
    }

}
