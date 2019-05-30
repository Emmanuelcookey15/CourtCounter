package com.example.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA = 0;
    int scoreB = 0;
    private TextView scoreOfTeamA;
    private TextView scoreOfTeamB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button resetScore = findViewById(R.id.btn_reset);

        resetScore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreA = 0;
                scoreB = 0;
                updateScoreOfTeamA(scoreA);
                updateScoreOfTeamB(scoreB);
            }
        });
    }


//   Logic for updating and displaying the score for Team A is below

    private void updateScoreOfTeamA(int value){
        scoreOfTeamA = findViewById(R.id.tv_score);
        scoreOfTeamA.setText(String.valueOf(value));
    }


    public void changeScoreAByThree(View view){
        scoreA = scoreA + 3;
        updateScoreOfTeamA(scoreA);
    }

    public void changeScoreAByTwo(View view){
        scoreA = scoreA + 2;
        updateScoreOfTeamA(scoreA);

    }

    public void changeScoreAByOne(View view){
        scoreA = scoreA + 1;
        updateScoreOfTeamA(scoreA);
    }




//   Logic for updating and displaying the score for Team B is below

    private void updateScoreOfTeamB(int value){
        scoreOfTeamB = findViewById(R.id.tv_score2);
        scoreOfTeamB.setText(String.valueOf(value));
    }

    public void changeScoreBByThree(View view){
        scoreB = scoreB + 3;
        updateScoreOfTeamB(scoreB);
    }

    public void changeScoreBByTwo(View view){
        scoreB = scoreB + 2;
        updateScoreOfTeamB(scoreB);

    }

    public void changeScoreBByOne(View view){
        scoreB = scoreB + 1;
        updateScoreOfTeamB(scoreB);
    }
}
