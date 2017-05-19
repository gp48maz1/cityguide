package com.example.andriod.cityguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by GaryPeters on 5/19/17.
 */

public class FoodActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Place> places = new ArrayList<>();

        places.add(new Place("Commons", "peabody", true, false, false, false, 4.0f));
        places.add(new Place("Rand", "sarratt", false, true, true, true, 3.0f));
        places.add(new Place("Pub", "sarratt", true, true, true, true, 4.5f));
        places.add(new Place("Quiznoes", "highlands", false, false, true, true, 2.5f));
        places.add(new Place("Greens", "24th", false, true, true, true, 4.0f));




        //This passes in the color id from color because this java script handles everything about the data, the adapter handles everything about the view

        //set an adapter
        PlaceAdapter itemsAdapter =
                new PlaceAdapter(this, places, R.color.category_food);

        //set a listView
        ListView listView = (ListView) findViewById(R.id.list);

        //Change the background color here, you wouldn't add it to the class cause its bigger scope, the place adapter doesn't need to handle?

        //set adapter onto listview
        listView.setAdapter(itemsAdapter);

    }
}
