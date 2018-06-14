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
        int button = intent.getIntExtra("button", 0);
        int button1 = intent.getIntExtra("button1",0);
        int button2 = intent.getIntExtra("button2",0);
        double button3 = intent.getDoubleExtra("button3",0.0);


    TextView textView = (TextView) findViewById(R.id.TextView);
        textView.setText(String.valueOf(button + button1 + button2 + button3));
    }
}
