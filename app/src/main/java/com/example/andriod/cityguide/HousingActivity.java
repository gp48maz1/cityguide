package com.example.andriod.cityguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;

/**
 * Created by GaryPeters on 5/17/17.
 */

public class HousingActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.word_list);
        }

        ArrayList<Place> places = new ArrayList<>();

        places.add(new Place("Crawford", "peabody", true, false, false, false, 4));

}
