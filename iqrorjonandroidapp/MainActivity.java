package com.example.iqrorjonandroidapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Integer button_click_counter = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void main_button_onclick(View view) {
        button_click_counter = button_click_counter + 1;
        Button main_button = findViewById(R.id.main_button);
        String count = button_click_counter.toString();
        main_button.setText(count);

        if (button_click_counter == 1){
            ConstraintLayout main_layout = findViewById(R.id.main_layout);
            TextView main_text = findViewById(R.id.main_text);

            main_layout.setBackgroundColor(Color.rgb(250, 250, 250));
            main_text.setTextColor(Color.rgb(127, 0, 255));
            main_text.setText("Subhanalloh");

        }else if (button_click_counter == 33){
            ConstraintLayout main_layout = findViewById(R.id.main_layout);
            TextView main_text = findViewById(R.id.main_text);

            main_layout.setBackgroundColor(Color.rgb(128, 128, 128));
            main_text.setTextColor(Color.rgb(255, 255, 255));
            main_text.setText("Alhamdulillah");

        }else if (button_click_counter == 66){
            ConstraintLayout main_layout = findViewById(R.id.main_layout);
            TextView main_text = findViewById(R.id.main_text);

            main_layout.setBackgroundColor(Color.rgb(0, 0, 0));
            main_text.setText("Allohu Akbar");

        }else if (button_click_counter == 99){
            ConstraintLayout main_layout = findViewById(R.id.main_layout);
            TextView main_text = findViewById(R.id.main_text);

            main_layout.setBackgroundColor(Color.rgb(255, 255, 255));
            main_text.setText("Subhanalloh, Alhamdulillah, Allohu Akbar");
            main_text.setTextSize(20);
            main_text.setTextColor(Color.rgb(0, 204, 0));
            button_click_counter = 0;
            main_button.setText("0");
        }
    }


}