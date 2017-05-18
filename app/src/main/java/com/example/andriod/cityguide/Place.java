package com.example.andriod.cityguide;

import java.util.Arrays;

/**
 * Created by GaryPeters on 5/17/17.
 */

public class Place {
    /**
     * Private Variables
     */
    private String[] regions = {"highlands", "peabody", "alumni", "kissam", "24th"};
    private String mName;
    private String mRegion;
    private boolean mFresh;
    private boolean mSoph;
    private boolean mJr;
    private boolean mSr;
    private float mRating;

    //HAVE TO ADD IN IMAGE

    /**
     * Constructor
     */
    public Place(String name, String region, boolean fresh, boolean soph, boolean junior, boolean senior, float rating){

        this.mName = name;

        if (Arrays.asList(regions).contains(region.trim().toLowerCase())){
            this.mRegion = region;
        } else {
            throw new IllegalArgumentException("Invalid Region: " +region+ ". Must be an actual region");
        }

        this.mFresh = fresh;
        this.mSoph = soph;
        this.mJr = junior;
        this.mSr = senior;
        //NEED TO PUT PARAMETERS ON RATING 1-5
        this.mRating = rating;
    }


    /**
     * Set Methods
     * @param name
     */
    public void setName(String name){
        this.mName = name;
    }

    public void setRegion(String region) {
        if (Arrays.asList(regions).contains(region.trim().toLowerCase())) {
            this.mRegion = region;
        } else {
            throw new IllegalArgumentException("Invalid Region: " + region + ". Must be an actual region");
        }
    }

    public void setFreshman(boolean fresh){
        this.mFresh = fresh;
    }

    public void setSophomore(boolean soph){
        this.mSoph = soph;
    }

    public void setJunior(boolean jr){
        this.mJr = jr;
    }

    public void setSenior(boolean sr){
        this.mSr = sr;
    }

    public void setRating(float rating){
        this.mRating = rating;
    }

    /**
     * Getter / Is Methods
     */
    public String getName(){
        return mName;
    }

    public String getRegion(){
        return mRegion;
    }

    public boolean isFreshman(){
        return mFresh;
    }

    public boolean isSophomore(){
        return mSoph;
    }

    public boolean isJunior(){
        return mJr;
    }

    public boolean isSenior(){
        return mSr;
    }

    public float getRating(){
        return mRating;
    }
}
