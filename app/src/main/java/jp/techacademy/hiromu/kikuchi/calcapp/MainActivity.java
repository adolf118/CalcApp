package jp.techacademy.hiromu.kikuchi.calcapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.content.Intent;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText mEditText;
    EditText mEditText1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);

        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);

        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(this);


        mEditText = (EditText) findViewById(R.id.EditText);
        mEditText1 = (EditText) findViewById(R.id.EditText1);

    }


    @Override
    public void onClick(View v) {


        String str1 = mEditText.getText().toString();
        int num1 = Integer.parseInt(str1);

        String str2 = mEditText1.getText().toString();
        int num2 = Integer.parseInt(str2);

        Intent intent = new Intent(this, CalcApp2.class);

        if (v.getId() == R.id.button) {
            int result = num1 + num2;
            intent.putExtra("button", result);
            startActivity(intent);

        } else if (v.getId() == R.id.button1) {
            int result = num1 - num2;
            intent.putExtra("button1", result);
            startActivity(intent);

        } else if (v.getId() == R.id.button2) {
            int result = num1 * num2;
            intent.putExtra("button2", result);
            startActivity(intent);

        } else if (v.getId() == R.id.button3) {
            int result = num1 / num2;
            intent.putExtra("button3", result);
            startActivity(intent);

            if(str1.equals("")){
                Toast.makeText(this, "数値が入力されていません。", Toast.LENGTH_SHORT).show();
            } else if(str2.equals("")) {
                Toast.makeText(this, "数値が入力されていません", Toast.LENGTH_SHORT).show();
            }

        }







    }

}
