package com.example.ex10_activity_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = findViewById(R.id.btn1);
        RadioButton rdoSecond = findViewById(R.id.rdoSecond);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //다른 액티비티로 이동
                //1.인텐트를 만든다
                //2.인텐트를 쏜다.

//                Intent intent1 = new Intent(MainActivity.this, SecondActivity.class);
//                startActivity(intent1);

                Intent intent1;

                if(rdoSecond.isChecked())//두번째 액티비티로 이동
                    intent1 = new Intent(MainActivity.this, SecondActivity.class);
                else//세번째 액티비티로 이동
                    intent1 = new Intent(MainActivity.this, ThirdActivity.class);

                startActivity(intent1);
            }
        });
    }
}