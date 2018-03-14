package com.example.feder.udacityproject2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamFiuggi = 0;
    int scoreTeamFrasassi = 0;

    TextView textFiuggi;
    TextView textFrasassi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textFiuggi = findViewById(R.id.team_fiuggi_score);
        textFrasassi = findViewById(R.id.team_frasassi_score);

        displayForTeamFiuggi(0);
        displayForTeamFrasassi(0);
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        // Save UI state changes to the savedInstanceState.
        // This bundle will be passed to onCreate if the process is
        // killed and restarted.
        savedInstanceState.putInt("scoreTeamFiuggi", scoreTeamFiuggi);
        savedInstanceState.putInt("scoreTeamFrasassi", scoreTeamFrasassi);
        super.onSaveInstanceState(savedInstanceState);
    }
    //onRestoreInstanceState
    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        // Restore UI state from the savedInstanceState.
        // This bundle has also been passed to onCreate.
        scoreTeamFiuggi = savedInstanceState.getInt("scoreTeamFiuggi");
        scoreTeamFrasassi = savedInstanceState.getInt("scoreTeamFrasassi");
        displayForTeamFiuggi (scoreTeamFiuggi);
        displayForTeamFrasassi(scoreTeamFrasassi);
    }

    /**
     * Displays the +3 for Team Fiuggi.
     */
    public void addThreeForTeamFiuggi(View v) {
        scoreTeamFiuggi += 3;
        displayForTeamFiuggi(scoreTeamFiuggi);
    }

    /**
     * Penalty the - 1 for Team A.
     */
    public void penaltyFiuggi(View v) {
        scoreTeamFiuggi -= 1;
        displayForTeamFiuggi(scoreTeamFiuggi);
    }


    /**
     * Displays the +3 for Team B.
     */
    public void addThreeForTeamFrasassi(View v) {
        scoreTeamFrasassi += 3;
        displayForTeamFrasassi(scoreTeamFrasassi);
    }

    /**
     * Penalty -1 for Team Frasassi.
     */
    public void penaltyFrasassi(View v) {
        scoreTeamFrasassi -= 1;
        displayForTeamFrasassi(scoreTeamFrasassi);
    }

    /**
     * Resets
     */
    public void resetScore (View V) {
        scoreTeamFiuggi = 0;
        scoreTeamFrasassi = 0;
        displayForTeamFiuggi(scoreTeamFiuggi);
        displayForTeamFrasassi(scoreTeamFrasassi);
    }

    /**
     * Displays the given score for Team Fiuggi.
     */
    public void displayForTeamFiuggi(int score) {
        textFiuggi.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Team Frasassi.
     */
    public void displayForTeamFrasassi(int score) {
        textFrasassi.setText(String.valueOf(score));
    }


}
