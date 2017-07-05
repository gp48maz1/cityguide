package com.example.andriod.cityguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by GaryPeters on 5/19/17.
 */

public class DrinksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Place> places = new ArrayList<>();

        places.add(new Place(getString(R.string.f_frat), getString(R.string.p_24), true, true, false, false, 2.0f));
        places.add(new Place(getString(R.string.f_ph), getString(R.string.p_peabody), false, false, false, true, 5.0f));
        places.add(new Place(getString(R.string.f_pub), getString(R.string.p_sarratt), false, false, true, true, 4.5f));
        places.add(new Place(getString(R.string.f_chili), getString(R.string.p_24), false, true, true, true, 3.5f));


        //This passes in the color id from color because this java script handles everything about the data, the adapter handles everything about the view

        //set an adapter
        PlaceAdapter itemsAdapter =
                new PlaceAdapter(this, places, R.color.category_drinks);

        //set a listView
        ListView listView = (ListView) findViewById(R.id.list);

        //Change the background color here, you wouldn't add it to the class cause its bigger scope, the place adapter doesn't need to handle?

        //set adapter onto listview
        listView.setAdapter(itemsAdapter);

    }
}
