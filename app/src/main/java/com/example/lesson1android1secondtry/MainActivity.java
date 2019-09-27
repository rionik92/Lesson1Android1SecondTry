package com.example.lesson1android1secondtry;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView flightClassTitleView;
    TextView textViewAirportName1;
    TextView textViewAirportName2;
    TextView boardingTime;
    TextView underBoarTime;
    TextView remaining;
    TextView underReamainTime;
    ConstraintLayout boardingTimeZone;
    ConstraintLayout flightZone;
    TextView flightText;
    TextView gateText;
    TextView groupText;
    TextView seatText;
    TextView flightNumber;
    TextView gateNumber;
    TextView groupNumber;
    TextView seatNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        flightClassTitleView = findViewById(R.id.flight_class_title);
        textViewAirportName1 = findViewById(R.id.airport_code_first);
        textViewAirportName2 = findViewById(R.id.airport_code_second);
        boardingTimeZone = findViewById(R.id.boardingTimeZone);
        flightZone = findViewById(R.id.flightZone);
        boardingTime = findViewById(R.id.boardingTime);
        underBoarTime = findViewById(R.id.underBoadTime);
        remaining = findViewById(R.id.remaining);
        underReamainTime = findViewById(R.id.underRemainTime);
        flightText = findViewById(R.id.flightText);
         gateText = findViewById(R.id.gateText);
         groupText= findViewById(R.id.groupText);
         seatText= findViewById(R.id.seatText);
         flightNumber= findViewById(R.id.flightNum);
         gateNumber= findViewById(R.id.gateNum);
         groupNumber= findViewById(R.id.groupNum);
         seatNumber= findViewById(R.id.seatNum);
    }

    public void onFlightClassTitleClick(View v){
        textViewAirportName1.setText(getResources().getString(R.string.airport3_name));
        textViewAirportName2.setText(getResources().getString(R.string.airport4_name));

    }

    public void onAirportNameClick(View v){
        boardingTimeZone.setBackgroundColor(getResources().getColor(R.color.colorOrange));
        boardingTime.setTextColor(getResources().getColor(R.color.colorGreen));
        underBoarTime.setTextColor(getResources().getColor(R.color.colorGreen));
        remaining.setTextColor(getResources().getColor(R.color.colorGreen));
        underReamainTime.setTextColor(getResources().getColor(R.color.colorGreen));

    }

    public void onAirportName2Click(View v){
        flightZone.setBackgroundColor(getResources().getColor(R.color.colorGreenDark));
        flightText.setTextColor(getResources().getColor(R.color.colorWhite));
         gateText.setTextColor(getResources().getColor(R.color.colorWhite));
         groupText.setTextColor(getResources().getColor(R.color.colorWhite));
         seatText.setTextColor(getResources().getColor(R.color.colorWhite));
         flightNumber.setTextColor(getResources().getColor(R.color.colorWhite));
         gateNumber.setTextColor(getResources().getColor(R.color.colorWhite));
         groupNumber.setTextColor(getResources().getColor(R.color.colorWhite));
         seatNumber.setTextColor(getResources().getColor(R.color.colorWhite));
    }

}
