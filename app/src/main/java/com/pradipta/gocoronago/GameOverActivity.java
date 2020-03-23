package com.pradipta.gocoronago;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class GameOverActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_over);

        List<String> tips = Arrays.asList("Wash your hands often", "Cough into your elbow", "Don't touch your face", "Keep a distance of a metre from everybody", "Feeling sick? Stay home. Play the game. Save everybody. Kill the viruses.");

        TextView tip = findViewById(R.id.highScoreTxt);
        int random = new Random().nextInt(5);
        tip.setText(tips.get(random));
    }
}
