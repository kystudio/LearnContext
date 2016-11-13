package com.kystudio.learncontext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        iv = new ImageView(this);
        iv.setImageResource(R.mipmap.ic_launcher);

        setContentView(iv);

        //setContentView(R.layout.activity_main);
    }
}
