package com.example.andriod.cityguide;

import java.util.Arrays;

/**
 * Created by GaryPeters on 5/17/17.
 */

public class Place {
    /**
     * Private Variables
     */
    private String[] regions = {String.valueOf(R.string.r_high), String.valueOf(R.string.r_peabody), String.valueOf(R.string.r_alumni), String.valueOf(R.string.r_cq), String.valueOf(R.string.r_24), String.valueOf(R.string.r_sarratt)};
    //private final static String mFreshman = "Freshman";
    //private final static String mSophomore = "Sophomore";
    //private final static String mJunior = "Junior";
    //private final static String mSenior = "Senior";
    private String mName;
    private String mRegion;
    private boolean mFresh;
    private boolean mSoph;
    private boolean mJr;
    private boolean mSr;
    private float mRating;
    private int mImageRef = NO_IMAGE;

    private static final int NO_IMAGE = -1;

    //HAVE TO ADD IN IMAGE

    /**
     * Constructor
     */
    public Place(String name, String region, boolean fresh, boolean soph, boolean junior, boolean senior, float rating) {

        this.mName = name;

        if (Arrays.asList(regions).contains(region.trim().toLowerCase())) {
            this.mRegion = region;
        }

        this.mFresh = fresh;
        this.mSoph = soph;
        this.mJr = junior;
        this.mSr = senior;
        //NEED TO PUT PARAMETERS ON RATING 1-5
        this.mRating = rating;
    }

    /**
     * Constructor
     */
    public Place(String name, String region, boolean fresh, boolean soph, boolean junior, boolean senior, float rating, int imageRef) {

        this.mName = name;

        if (Arrays.asList(regions).contains(region.trim().toLowerCase())) {
            this.mRegion = region;
        }

        this.mFresh = fresh;
        this.mSoph = soph;
        this.mJr = junior;
        this.mSr = senior;
        //NEED TO PUT PARAMETERS ON RATING 1-5
        this.mRating = rating;

        this.mImageRef = imageRef;
    }


    /**
     * Set Methods
     *
     * @param name
     */
    public void setName(String name) {
        this.mName = name;
    }

    /**
     * Getter / Is Methods
     */
    public String getName() {
        return mName;
    }

    public String getRegion() {
        return mRegion;
    }

    public int getImage() {
        return mImageRef;
    }


    /**
     * Check to see if various items exist
     *
     * @return
     */

    public boolean isFreshman() {
        return mFresh;
    }

    public boolean isSophomore() {
        return mSoph;
    }

    public boolean isJunior() {
        return mJr;
    }

    public boolean isSenior() {
        return mSr;
    }

    public float getRating() {
        return mRating;
    }

    public boolean isImage() {
        if (mImageRef == NO_IMAGE) {
            return false;
        } else {
            return true;
        }
    }
}
