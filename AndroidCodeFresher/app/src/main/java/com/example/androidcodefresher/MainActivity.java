package com.example.androidcodefresher;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView scoreA;
    private TextView scoreB;
    private Button btn1a;
    private Button btn2a;
    private Button btn3a;
    private Button btn1b;
    private Button btn2b;
    private Button btn3b;
    private Button reset;
    private int counterA = 0;
    private int counterB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mapId();
        setUp();
    }

    private void mapId() {
        scoreA = findViewById(R.id.teama);
        scoreB = findViewById(R.id.teamb);
        btn1a = findViewById(R.id.btn1a);
        btn2a = findViewById(R.id.btn2a);
        btn3a = findViewById(R.id.btn3a);
        reset = findViewById(R.id.reset);
        btn1b = findViewById(R.id.btn1b);
        btn2b = findViewById(R.id.btn2b);
        btn3b = findViewById(R.id.btn3b);
    }

    private void update() {
        scoreA.setText(String.valueOf(counterA));
        scoreB.setText(String.valueOf(counterB));
    }

    private void plus1a() {
        counterA++;
        update();
    }

    private void plus2a() {
        counterA = counterA + 2;
        update();
    }

    private void plus3a() {
        counterA = counterA + 3;
        update();
    }

    private void plus1b() {
        counterB++;
        update();
    }

    private void plus2b() {
        counterB = counterB + 2;
        update();
    }

    private void plus3b() {
        counterB = counterB + 3;
        update();
    }

    private void reset() {
        counterA = 0;
        counterB = 0;
        update();
    }

    private void setUp() {
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reset();
            }
        });
        btn1a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                plus1a();
            }
        });
        btn2a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                plus2a();
            }
        });
        btn3a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                plus3a();
            }
        });
        btn1b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                plus1b();
            }
        });
        btn2b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                plus2b();
            }
        });
        btn3b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                plus3b();
            }
        });
    }


}