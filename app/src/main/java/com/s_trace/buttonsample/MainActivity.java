package com.s_trace.buttonsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RelativeLayout scan_mode_btn = findViewById(R.id.scan_mode_btn);
        scan_mode_btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        ImageView scan_img =  findViewById(R.id.scan_img);
        if (scan_img.getVisibility() == View.INVISIBLE) {
            scan_img.setVisibility(View.VISIBLE);
        } else {
            scan_img.setVisibility(View.INVISIBLE);
        }
    }
}
