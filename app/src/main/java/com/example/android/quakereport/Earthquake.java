package com.example.android.quakereport;

/**
 * Created by Ali on 2/14/2017.
 */

public class Earthquake {
    /** Magnitude of earthquake */
    private double mMagnitude;

    /** Location of earthquake */
    private String mLocation;

    /** Date of earthquake */
    private long mTimeInMilliseconds;

    /**
     * Constructs a new {@link Earthquake} object.
     *
     * @param magnitude is the magnitude (size) of the earthquake
     * @param location is the city location of the earthquake
     * @param timeInMilliseconds is the date the earthquake happende
     */
    public Earthquake(double magnitude, String location, long timeInMilliseconds){
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
    }

    /**
     * Return the magnitude of the earthquake
     */
    public double getmMagnitude(){
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
    public long getmTimeInMilliseconds(){
        return mTimeInMilliseconds;
    }

}
