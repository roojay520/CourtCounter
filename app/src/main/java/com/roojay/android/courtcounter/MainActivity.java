package com.roojay.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int scorea = 0;
    int scoreb = 0;


    /**
     * Add 3 points for the Team A.
     */
    public void addThreeA(View view) {
        scorea = scorea + 3;
        displayTeamscorea(scorea);
    }

    /**
     * Add 2 points for the Team A.
     */
    public void addTwoA(View view) {
        scorea = scorea + 2;
        displayTeamscorea(scorea);
    }

    /**
     * Add 1 point for the Team A.
     */
    public void addOneA(View view) {
        scorea = scorea + 1;
        displayTeamscorea(scorea);
    }

    /**
     * Displays the given scorea for Team A.
     */
    public void displayTeamscorea(int scorea) {
        TextView scoreaView = (TextView) findViewById(R.id.pointsa_text_view);
        scoreaView.setText(String.valueOf(scorea));
    }


    /**
     * Add 3 points for the Team B.
     */
    public void addThreeB(View view) {
        scoreb = scoreb + 3;
        displayTeamscorea(scoreb);
    }

    /**
     * Add 2 points for the Team B.
     */
    public void addTwoB(View view) {
        scoreb = scoreb + 2;
        displayTeamscorea(scoreb);
    }

    /**
     * Add 1 point for the Team .
     */
    public void addOneB(View view) {
        scoreb = scoreb + 1;
        displayTeamscorea(scoreb);
    }

    /**
     * Displays the given scorea for Team A.
     */
    public void displayTeamscoreb(int scoreb) {
        TextView scorebView = (TextView) findViewById(R.id.pointsb_text_view);
        scorebView.setText(String.valueOf(scoreb));
    }


    public void reset(View view) {
        scorea = 0;
        scoreb = 0;
        displayTeamscorea(scoreb);
        displayTeamscoreb(scoreb);

    }
}
