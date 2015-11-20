package com.suyogindia.svntest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Home extends AppCompatActivity {
    TextView tvName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        //some changes
        tvName = (TextView) findViewById(R.id.textView);
        tvName.setText("asldbnksdfjg");
    }
}
