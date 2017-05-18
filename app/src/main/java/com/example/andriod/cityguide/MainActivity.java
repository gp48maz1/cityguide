package com.example.andriod.cityguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Find the view for each category
        TextView housing = (TextView) findViewById(R.id.housing);
        TextView drinks = (TextView) findViewById(R.id.drinks);
        TextView ent = (TextView) findViewById(R.id.ent);
        TextView food = (TextView) findViewById(R.id.food);

        housing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent housingIntent = new Intent(MainActivity.this, HousingActivity.class);
                startActivity(housingIntent);
            }
        });
    }
}
