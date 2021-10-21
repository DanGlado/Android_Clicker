package com.example.project_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mainText;
    Button mainBtn;
    Button mainBtn2;
    Button mainBtn3;

    private int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainText = (TextView) findViewById(R.id.mainTxt);
        mainBtn = (Button) findViewById(R.id.main_btn);
        mainBtn.setOnClickListener(clickListener);

        mainBtn2 = (Button) findViewById(R.id.main_btn2);
        mainBtn2.setOnClickListener(clickListener2);

        mainBtn3 = (Button) findViewById(R.id.main_btn3);
        mainBtn3.setOnClickListener(clickListener3);
    }

    View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            score++;
            int ost = score % 10;
            int osta = score % 100;
            if (((ost > 1 && ost < 5) || (ost < -1 && ost > -5)) && osta != 12 && osta != 13 && osta != 14) {
                String s = "Кнопка нажата: " + score + " раза";
                mainText.setText(s.toCharArray(), 0, s.length());
            } else {
                String s = "Кнопка нажата: " + score + " раз";
                mainText.setText(s.toCharArray(), 0, s.length());
            }
        }
    };
    View.OnClickListener clickListener2 = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            score--;
            int ost = score % 10;
            int osta = score % 100;
            if (((ost > 1 && ost < 5) || (ost < -1 && ost > -5)) && osta != 12 && osta != 13 && osta != 14) {
                String s = "Кнопка нажата: " + score + " раза";
                mainText.setText(s.toCharArray(), 0, s.length());
            } else {
                String s = "Кнопка нажата: " + score + " раз";
                mainText.setText(s.toCharArray(), 0, s.length());
            }
        }
        };
    View.OnClickListener clickListener3 = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            score = 0;
            String s = "Кликов: " + score;
            mainText.setText(s.toCharArray(), 0, s.length());
        }
    };
}

