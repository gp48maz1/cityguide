package com.example.andriod.cityguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by GaryPeters on 5/17/17.
 */

public class PlaceAdapter extends ArrayAdapter<Place>{

    private int mColorID;

    public PlaceAdapter(Context context, ArrayList<Place> places, int colorID){
        super(context, 0, places);
        mColorID = colorID;
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

        ImageView ivImage = (ImageView) listItemView.findViewById(R.id.image);

        View vBackground = listItemView.findViewById(R.id.item_capsule);


        //Do Image secon

        //Populate the data into the template view using the data object
        //In this step where I have a textView defined and the Object defined im hooking each item up line by line
        // so Java knows whats what, its essentially drawing lines to connect dots.
        tvName.setText(place.getName());
        tvRegion.setText(place.getRegion());

        //If the Tags are there for a given year they display if not they are gone
        //TO GRADER SHOULD THE SET TEXT BELOW BE GET METHODS? GET METHODS THAT RETRIVE FINAL PRIVATE STATIC?
        if (place.isFreshman()){
            tvFresh.setVisibility(View.VISIBLE);
            tvFresh.setText(R.string.fresh);
        } else {
            tvFresh.setVisibility(View.GONE);
        }

        if (place.isSophomore()){
            tvSoph.setVisibility(View.VISIBLE);
            tvSoph.setText(R.string.soph);
        } else {
            tvSoph.setVisibility(View.GONE);
        }

        if (place.isJunior()){
            tvJr.setVisibility(View.VISIBLE);
            tvJr.setText(R.string.jr);
        } else {
            tvJr.setVisibility(View.GONE);
        }

        if (place.isSenior()){
            tvSr.setVisibility(View.VISIBLE);
            tvSr.setText(R.string.sen);
        } else {
            tvSr.setVisibility(View.GONE);
        }

        //Now I am hooking up the star rating
        rating.setRating(place.getRating());

        //Set the image view to the right image.
        if (place.isImage()){
            ivImage.setImageResource(place.getImage());
        }

        //set background
        //TO GRADER - WHY IS CONTEXT COMPAT NEEDED? DOESN'T mCOLORID ALREADY HOLD THE COLOR ID?
        //WHY IS ANYTHING ABOUT CONTEXT NEEDED?
        int color = ContextCompat.getColor(getContext(), mColorID);
        vBackground.setBackgroundColor(color);

        return listItemView;
    }
}
