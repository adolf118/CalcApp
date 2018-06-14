package jp.techacademy.hiromu.kikuchi.calcapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.content.Intent;

public class CalcApp2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc_app2);

        Intent intent = getIntent();
        double button = intent.getDoubleExtra("button", 0.0);
        double button1 = intent.getDoubleExtra("button1",0.0);
        double button2 = intent.getDoubleExtra("button2",0.0);
        double button3 = intent.getDoubleExtra("button3",0.0);


    TextView textView = (TextView) findViewById(R.id.TextView);
        textView.setText(String.valueOf(button + button1 + button2 + button3));
    }
}
