package com.example.andriod.cityguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by GaryPeters on 5/17/17.
 */

public class PlaceAdapter extends ArrayAdapter<Place>{

    public PlaceAdapter(Context context, ArrayList<Place> places){
        super(context, 0, places);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //Get the data item for this position
        Place place = getItem(position);

        //To make it easier to think through
        View listItemView = convertView;

        //Check if an exisiting view is being reused, otherwise inflate the view
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        //Lookup view for place data
        TextView tvName = (TextView) listItemView.findViewById(R.id.name);
        TextView tvRegion = (TextView) listItemView.findViewById(R.id.region);
        TextView tvFresh = (TextView) listItemView.findViewById(R.id.freshman_tag);
        TextView tvSoph = (TextView) listItemView.findViewById(R.id.sophomore_tag);
        TextView tvJr = (TextView) listItemView.findViewById(R.id.junior_tag);
        TextView tvSr = (TextView) listItemView.findViewById(R.id.senior_tag);
        RatingBar rating = (RatingBar) listItemView.findViewById(R.id.ratingBar);

        //Do Image secon

        //Populate the data into the template view using the data object
        //In this step where I have a textView defined and the Object defined im hooking each item up line by line
        // so Java knows whats what, its essentially drawing lines to connect dots.
        tvName.setText(place.getName());
        tvRegion.setText(place.getRegion());

        //If the Tags are there for a given year they display if not they are gone
        if (place.isFreshman()){
            tvFresh.setVisibility(View.VISIBLE);
            tvFresh.setText("Freshman");
        } else {
            tvFresh.setVisibility(View.GONE);
        }

        if (place.isSophomore()){
            tvSoph.setVisibility(View.VISIBLE);
            tvSoph.setText("Sophomore");
        } else {
            tvSoph.setVisibility(View.GONE);
        }

        if (place.isJunior()){
            tvJr.setVisibility(View.VISIBLE);
            tvJr.setText("Junior");
        } else {
            tvJr.setVisibility(View.GONE);
        }

        if (place.isSenior()){
            tvSr.setVisibility(View.VISIBLE);
            tvSr.setText("Senior");
        } else {
            tvSr.setVisibility(View.GONE);
        }

        //Now I am hooking up the star rating
        rating.setRating(place.getRating());

        return listItemView;
    }
}
