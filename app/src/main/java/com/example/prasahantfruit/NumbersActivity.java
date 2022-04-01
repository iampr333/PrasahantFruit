package com.example.prasahantfruit;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    int fruitImages[] = {R.drawable.apple,R.drawable.banana,R.drawable.mango,R.drawable.coconut,R.drawable.guava,R.drawable.orange,R.drawable.pineapple,R.drawable.armond,R.drawable.papaya,R.drawable.fig};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        NumberData one = new NumberData("सेब","Apple");
        NumberData two = new NumberData("केला","Banana");
       NumberData three = new NumberData("आम","Mango");
       NumberData four = new NumberData("नारियल","Coconut");
       NumberData five = new NumberData("अमरुद","Guava");
        NumberData six = new NumberData("संतरा","Orange");
      NumberData seven = new NumberData("अनानास","Pineapple");
      NumberData eight = new NumberData("बादाम","Almond");
       NumberData nine = new NumberData("पपीता","Papaya");
        NumberData ten = new NumberData("अंजीर","Fig");

        int index = 0;
        ArrayList <NumberData> words = new ArrayList<NumberData>();
        words.add(one);
        words.add(two);
        words.add(three);
        words.add(four);
        words.add(five);
        words.add(six);
        words.add(seven);
        words.add(eight);
        words.add(nine);
        words.add(ten);
        CustomAdapter customAdapter = new CustomAdapter(this,R.layout.list_item,words,fruitImages);
             ListView listView = findViewById(R.id.listNumbers);
             listView.setAdapter(customAdapter);
    }
}
