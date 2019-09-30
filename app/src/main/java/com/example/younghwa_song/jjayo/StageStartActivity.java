package com.example.younghwa_song.jjayo;

import android.content.Intent;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class StageStartActivity extends AppCompatActivity {

    TextView stage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stage_start);

        stage = findViewById(R.id.stage);

        Intent intent = getIntent();
        stage.setText("Stage " + String.valueOf(intent.getIntExtra("Stage", 0)));

        new Thread(new Runnable() {
            @Override
            public void run() {
                SystemClock.sleep(2000);
                startActivity(new Intent(getApplicationContext(), VideoPlayActivity.class));
            }
        }).start();
    }
}
