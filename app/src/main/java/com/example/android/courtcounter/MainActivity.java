package com.example.android.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    int score_a, score_b;

//    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        TextView tv = new TextView(this); // requires context
        tv.setText("Hello, manually injected view");
        setContentView(tv);  // set content
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void incrementA_3(View view) {
        displayForTeamA(score_a += 3);
    }

    public void incrementA_2(View view) {
        displayForTeamA(score_a += 2);
    }

    public void incrementA_free_throw(View view) {
        displayForTeamA(score_a += 1);
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void incrementB_3(View view) {
        displayForTeamB(score_b += 3);
    }

    public void incrementB_2(View view) {
        displayForTeamB(score_b += 2);
    }

    public void incrementB_free_throw(View view) {
        displayForTeamB(score_b += 1);
    }

    public void reset_button(View view) {
        // showResult();
        score_a = score_b = 0;
        displayForTeamA(score_a);
        displayForTeamB(score_b);
    }

    // public void showResult() {
    // TextView resultTextView = (TextView)
    // findViewById(R.id.previous_games_winner);
    // if (score_a > score_b)
    // resultTextView.setText("Team A");
    // else if (score_a < score_b)
    // resultTextView.setText("Team B");
    // else
    // resultTextView.setText("Tie");
    // }
}
