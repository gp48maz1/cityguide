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

            places.add(new Place("Crawford", "peabody", true, false, false, false, 4.0f, R.drawable.h_crawford));
            places.add(new Place("East", "peabody", true, false, false, false, 2.0f, R.drawable.h_east));
            places.add(new Place("West", "peabody", true, false, false, false, 1.5f));
            places.add(new Place("North", "peabody", true, false, false, false, 2.5f, R.drawable.h_north));
            places.add(new Place("Gillette", "peabody", true, false, false, false, 3.0f, R.drawable.h_gillette));

            places.add(new Place("Memorial", "peabody", true, false, false, false, 3.0f, R.drawable.h_memorial));
            places.add(new Place("Murray", "peabody", true, false, false, false, 4.0f, R.drawable.h_murray));
            places.add(new Place("Hank Ingram", "peabody", true, false, false, false, 4.5f, R.drawable.h_ingram));
            places.add(new Place("Stambaugh", "peabody", true, false, false, false, 5.0f, R.drawable.h_stambaugh));
            places.add(new Place("Sutherland", "peabody", true, false, false, false, 4.5f));

            places.add(new Place("Alumni", "alumni", false, true, true, false, 2.5f, R.drawable.h_alumni));
            places.add(new Place("Warren and Moore", "College Quad", false, true, true, true, 5.0f, R.drawable.h_wh));
            places.add(new Place("Towers East", "24th", false, true, true, false, 3.5f, R.drawable.h_towers_12));
            places.add(new Place("Towers West", "24th", false, false, true, true, 4.0f, R.drawable.h_towers_34));
            places.add(new Place("Branscomb", "Sarratt", false, true, false, false, 3.5f, R.drawable.h_brandscomb));
            places.add(new Place("Chaffin", "highlands", false, false, true, true, 4.0f, R.drawable.h_chaffin));
            places.add(new Place("Morgan and Lewis", "highlands", false, false, true, true, 3.5f, R.drawable.h_lews));
            places.add(new Place("Mayfield", "highlands", false, true, true, true, 3.5f, R.drawable.h_mayfield));



            //This passes in the color id from color because this java script handles everything about the data, the adapter handles everything about the view

            //set an adapter
            PlaceAdapter itemsAdapter =
                    new PlaceAdapter(this, places, R.color.category_housing);

            //set a listView
            ListView listView = (ListView) findViewById(R.id.list);

            //Change the background color here, you wouldn't add it to the class cause its bigger scope, the place adapter doesn't need to handle?

            //set adapter onto listview
            listView.setAdapter(itemsAdapter);

        }

}
