package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int faultTeamA = 0;
    int faultTeamB = 0;

    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("scoreTeamA", scoreTeamA);
        outState.putInt("scoreTeamB", scoreTeamB);
        outState.putInt("faultTeamA", faultTeamA);
        outState.putInt("faultTeamB", faultTeamB);
    }


    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        scoreTeamA = savedInstanceState.getInt("scoreTeamA");
        scoreTeamB = savedInstanceState.getInt("scoreTeamB");
        faultTeamA = savedInstanceState.getInt("faultTeamA");
        faultTeamB = savedInstanceState.getInt("faultTeamB");
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayGoalTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_goal);
        scoreView.setText(String.valueOf(score));
    }

    public void displayFaultTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_fault);
        scoreView.setText(String.valueOf(score));
    }

    public void displayGoalTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_goal);
        scoreView.setText(String.valueOf(score));
    }

    public void displayFaultTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_fault);
        scoreView.setText(String.valueOf(score));
    }

    public void submitGoalTeamA(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayGoalTeamA(scoreTeamA);
    }

    public void submitFaultTeamA(View view) {
        faultTeamA = faultTeamA + 1;
        displayFaultTeamA(faultTeamA);
    }

    public void submitGoalTeamB(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayGoalTeamB(scoreTeamB);
    }

    public void submitFaultTeamB(View view) {
        faultTeamB = faultTeamB + 1;
        displayFaultTeamB(faultTeamB);
    }

    public void reset(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        faultTeamA = 0;
        faultTeamB = 0;
        displayGoalTeamA(scoreTeamA);
        displayGoalTeamB(scoreTeamB);
        displayFaultTeamA(faultTeamA);
        displayFaultTeamB(faultTeamB);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


}
