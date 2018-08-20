package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0, scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void threePointsA(View view) {
        scoreTeamA = scoreTeamA + 3;

        displayForTeamA(scoreTeamA);
    }

    public void twoPointsA(View view) {
        scoreTeamA = scoreTeamA + 2;

        displayForTeamA(scoreTeamA);
    }

    public void onePointA(View view) {
        scoreTeamA = scoreTeamA + 1;

        displayForTeamA(scoreTeamA);
    }

    public void displayForTeamA(int score) {
        TextView textView = (TextView) findViewById(R.id.team_A_score);
        textView.setText(String.valueOf(score));
    }

    public void threePointsB(View view) {
        scoreTeamB = scoreTeamB + 3;

        displayForTeamB(scoreTeamB);
    }

    public void twoPointsB(View view) {
        scoreTeamB = scoreTeamB + 2;

        displayForTeamB(scoreTeamB);
    }

    public void onePointB(View view) {
        scoreTeamB = scoreTeamB + 1;

        displayForTeamB(scoreTeamB);
    }

    public void displayForTeamB(int score) {
        TextView textView = (TextView) findViewById(R.id.team_B_score);
        textView.setText(String.valueOf(score));
    }

    public void resetScore(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;

        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}
