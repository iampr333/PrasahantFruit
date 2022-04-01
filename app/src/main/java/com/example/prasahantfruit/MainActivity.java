package com.example.prasahantfruit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView numbers;
    TextView familyMembers;
    TextView colors;
    TextView phrases;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        numbers = findViewById(R.id.numbersID);
        familyMembers  = findViewById(R.id.familyID);
        colors = findViewById(R.id.colorsID);
        phrases = findViewById(R.id.phrasesID);


        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,NumbersActivity.class);
                startActivity(intent);
            }
        });

        familyMembers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,FamilyMembersActivity.class);
                startActivity(intent);
            }
        });

        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ColorsActivity.class);
                startActivity(intent);
            }
        });

        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,PhrasesActivity.class);
                startActivity(intent);
            }
        });


    }
}