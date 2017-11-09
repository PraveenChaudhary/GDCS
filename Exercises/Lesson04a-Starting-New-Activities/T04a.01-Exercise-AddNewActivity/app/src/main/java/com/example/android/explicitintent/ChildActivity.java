package com.example.android.explicitintent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ChildActivity extends AppCompatActivity {

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);
        // Do steps 6 & 7 in ChildActivity.java
        // TODO (6) Create a TextView field to display your message
        // TODO (7) Get a reference to your TextView in Java
        mTextView = (TextView) findViewById(R.id.tv_display);
    }
}
