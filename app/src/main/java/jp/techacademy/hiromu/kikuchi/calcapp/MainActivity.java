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
        String str2 = mEditText1.getText().toString();

        if(str1.equals("")){
            Toast.makeText(this, "数値が入力されていません。", Toast.LENGTH_SHORT).show(); {
                return;
            }

        } else if(str2.equals("")) {
            Toast.makeText(this, "数値が入力されていません。", Toast.LENGTH_SHORT).show(); {
                return;
            }
        }


        double num1 = 0.0;
        double num2 = 0.0;

        try {
            num1 = Double.parseDouble(str1);
            num2 = Double.parseDouble(str2);
        }
        catch (Exception e) {
            Toast.makeText(this, "数値を入力してください。", Toast.LENGTH_SHORT).show();
            return;
        }


        Intent intent = new Intent(this, CalcApp2.class);



        if (v.getId() == R.id.button) {
            double result = num1 + num2;
            intent.putExtra("button", result);
            startActivity(intent);

        } else if (v.getId() == R.id.button1) {
            double result = num1 - num2;
            intent.putExtra("button1", result);
            startActivity(intent);

        } else if (v.getId() == R.id.button2) {
            double result = num1 * num2;
            intent.putExtra("button2", result);
            startActivity(intent);

        } else if (v.getId() == R.id.button3) {
            if (num2 == 0.0) {
                Toast.makeText(this, "ゼロで割り算することはできません。", Toast.LENGTH_SHORT).show();
                return;
            }

            {
                double result = num1 / num2;
                intent.putExtra("button3", result);
                startActivity(intent);
            }


        }
    }

}
