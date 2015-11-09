package com.example.bourymbodj.loginui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button b1;
    private EditText t1, t2;
    private int count;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1= ( Button) findViewById(R.id.button1);
        t1= (EditText) findViewById(R.id.text1);
        t2 = (EditText) findViewById(R.id.text2);
        b1.setOnClickListener(this);
    }


    @Override
    public View findViewById(int id) {
        return super.findViewById(id);
    }

    @Override
    public void onClick(View v) {

    }
}
