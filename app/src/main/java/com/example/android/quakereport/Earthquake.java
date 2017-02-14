package com.example.android.quakereport;

/**
 * Created by Ali on 2/14/2017.
 */

public class Earthquake {
    /** Magnitude of earthquake */
    private String mMagnitude;

    /** Location of earthquake */
    private String mLocation;

    /** Date of earthquake */
    private String mDate;

    /**
     * Constructs a new {@link Earthquake} object.
     *
     * @param magnitude is the magnitude (size) of the earthquake
     * @param location is the city location of the earthquake
     * @param date is the date the earthquake happende
     */
    public Earthquake(String magnitude, String location, String date){
        mMagnitude = magnitude;
        mLocation = location;
        mDate = date;
    }

    /**
     * Return the magnitude of the earthquake
     */
    public String getmMagnitude(){
        return mMagnitude;
    }

    /**
     * Return the location of the earthquake
     */
    public String getmLocation(){
        return mLocation;
    }

    /**
     * Return the date of the earthquake.
     */
    public String getmDate(){
        return mDate;
    }

}
