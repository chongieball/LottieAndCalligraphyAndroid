package com.example.chongieball.lottieandcalligraphydemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private static final String DATA = "data";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button anim1 = findViewById(R.id.btn_1);
        anim1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openFragment(1);
            }
        });

        Button anim2 = findViewById(R.id.btn_2);
        anim2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openFragment(2);
            }
        });

        Button anim3 = findViewById(R.id.btn_3);
        anim3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openFragment(3);
            }
        });
    }

    public void openFragment(int button) {
        AnimationFragment fragment = new AnimationFragment();
        Bundle args = new Bundle();
        args.putInt(DATA, button);
        fragment.setArguments(args);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fl_main, fragment)
                .commit();
    }
}
