package com.example.android.quakereport;

/**
 * Created by pcvincenzo on 26/11/17.
 */


public class Earthquake {
    /**
     * {@link Earthquake} represents a single earthquake event in the world.
     * Each object has 3 properties: magnitude, location and timestamp.
     */
    // Earthquake magnitude
    private String mMagnitude;

    // Earthquake location
    private String mLocation;

    // Earthquake timestamp
    private String mTime;

    /*
    * Create a new AndroidFlavor object.
    *
    * @param vMagnitude is the magnitude of te earthquake
    * @param vLocation is the location where the earthquake hits
    * @param vTime is the time at with the earthquake hits
    * */
    public Earthquake(String vMagnitude, String vLocation, String vTime)
    {
        mMagnitude = vMagnitude;
        mLocation = vLocation;
        mTime = vTime;
    }

    /**
     * Get the earthquake magnitude
     */
    public String getmMagnitude() {
        return mMagnitude;
    }

    /**
     * Get the earthquake location
     */
    public String getmLocation() {
        return mLocation;
    }

    /**
     * Get the earthquake time
     */
    public String getmTime() {
        return mTime;
    }

}

