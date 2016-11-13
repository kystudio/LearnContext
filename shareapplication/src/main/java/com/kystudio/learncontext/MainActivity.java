package com.kystudio.learncontext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main1);

        System.out.println("Main1 onCreate");

        textView = (TextView) findViewById(R.id.textView);
        editText = (EditText) findViewById(R.id.editText);

        textView.setText("共享的数据是：" + getApp().getTextData());

        findViewById(R.id.btnSaveData).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getApp().setTextData(editText.getText().toString());

                textView.setText("共享的数据是：" + editText.getText().toString());
            }
        });
    }

    public App getApp(){
        return (App) getApplicationContext();
    }
}
