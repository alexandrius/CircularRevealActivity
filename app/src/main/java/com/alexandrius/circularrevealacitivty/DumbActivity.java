package com.alexandrius.circularrevealacitivty;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;

public class DumbActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dumb);
        View v = findViewById(R.id.touch_me_view);
        v.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Intent i = new Intent(DumbActivity.this, RevealActivity.class);
                i.putExtra("x", (int)event.getX());
                i.putExtra("y", (int)event.getY());
                startActivity(i);
                return false;
            }
        });
    }
}
