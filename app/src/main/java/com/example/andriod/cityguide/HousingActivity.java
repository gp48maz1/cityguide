package com.example.andriod.cityguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;


public class HousingActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.word_list);

            ArrayList<Place> places = new ArrayList<>();

            places.add(new Place("Crawford", "peabody", true, true, true, true, 4.0f));
            places.add(new Place("East", "peabody", true, false, false, false, 2.0f));
            places.add(new Place("West", "peabody", true, false, false, false, 1.5f));
            places.add(new Place("North", "peabody", true, false, false, false, 2.5f));
            places.add(new Place("Gillette", "peabody", true, false, false, false, 3.0f));


            //set an adapter
            PlaceAdapter itemsAdapter =
                    new PlaceAdapter(this, places);

            //set a listView
            ListView listView = (ListView) findViewById(R.id.list);

            //set adapter onto listview
            listView.setAdapter(itemsAdapter);

        }

}
