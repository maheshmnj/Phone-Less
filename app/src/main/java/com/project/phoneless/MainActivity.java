package com.project.phoneless;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Switch;
import android.widget.TextClock;
import android.widget.TextView;

import java.security.Timestamp;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView textView1,textView2,textView3,state;
    ConstraintLayout parent;
    Calendar now;
    TextClock clock;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        parent = findViewById(R.id.parent);
        now = Calendar.getInstance();
        clock = findViewById(R.id.clock);
        textView1 = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);
        state = findViewById(R.id.DayState);
        clock.setOnClickListener(changecolor);
        changeBg(1);
    }

    View.OnClickListener changecolor = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int CurrentHour = now.get(Calendar.HOUR);
            int Random = new Random().nextInt(5);
            changeBg(Random);
        }
    };

    public void changeBg(int x){
        switch (x) {
            case 1: {
                parent.setBackgroundColor(getResources().getColor(R.color.DarkBlue));
                textView1.setTextColor(getResources().getColor(R.color.AnalogousWhite));
                textView2.setTextColor(getResources().getColor(R.color.AnalogousWhite));
                textView3.setTextColor(getResources().getColor(R.color.AnalogousWhite));
                clock.setTextColor(getResources().getColor(R.color.AnalogousWhite));
                state.setText("MORNING");
                state.setTextColor(getResources().getColor(R.color.AnalogousWhite));
            }
            break;
            case 2: {
                parent.setBackgroundColor(getResources().getColor(R.color.LightGreen));
                textView1.setTextColor(getResources().getColor(R.color.DarkBrown));
                textView2.setTextColor(getResources().getColor(R.color.DarkBrown));
                textView3.setTextColor(getResources().getColor(R.color.DarkBrown));
                clock.setTextColor(getResources().getColor(R.color.DarkBrown));
                state.setText("Afternoon");
                state.setTextColor(getResources().getColor(R.color.DarkBrown));
            }
            break;
            case 3: {
                parent.setBackgroundColor(getResources().getColor(R.color.LightPink));
                textView1.setTextColor(getResources().getColor(R.color.Black));
                textView2.setTextColor(getResources().getColor(R.color.Black));
                textView3.setTextColor(getResources().getColor(R.color.Black));
                clock.setTextColor(getResources().getColor(R.color.Black));
                state.setText("Evening");
                state.setTextColor(getResources().getColor(R.color.Black));

            }
            break;
            case 4:
            {
                parent.setBackgroundColor(getResources().getColor(R.color.DarkBrown));
                textView1.setTextColor(getResources().getColor(R.color.AnalogousWhite));
                textView2.setTextColor(getResources().getColor(R.color.AnalogousWhite));
                textView3.setTextColor(getResources().getColor(R.color.AnalogousWhite));
                clock.setTextColor(getResources().getColor(R.color.AnalogousWhite));
                state.setText("Night");
                state.setTextColor(getResources().getColor(R.color.AnalogousWhite));

            }
            break;
            default:
        }
    }
}

