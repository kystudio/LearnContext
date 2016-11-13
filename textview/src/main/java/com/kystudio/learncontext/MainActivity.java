package com.kystudio.learncontext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        tv = new TextView(this);
        tv.setText("Hello,World!");
        tv.setText(R.string.app_name);

        setContentView(tv);
        //setContentView(R.layout.activity_main);
    }
}
