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
    double mMagnitude;

    // Earthquake primary location
    private String mLocation;

    // Earthquake timestamp
    private long mTime;

    // Earthquake timestamp
    private String mUrl;

    /*
    * Create a new AndroidFlavor object.
    *
    * @param vMagnitude is the magnitude of te earthquake
    * @param vLocation is the location where the earthquake hits
    * @param vTime is the time at with the earthquake hits
    * */
    public Earthquake(double vMagnitude, String vLocation,long vTime, String vUrl)
    {
        mMagnitude = vMagnitude;
        mLocation = vLocation;
        mTime = vTime;
        mUrl = vUrl;
    }

    /**
     * Get the earthquake magnitude
     */
    public double getmMagnitude() {
        return mMagnitude;
    }

    /**
     * Get the earthquake primary location
     */
    public String getmLocation() {
        return mLocation;
    }

    /**
     * Get the earthquake time
     */
    public long getmTime() {
        return mTime;
    }

    /**
     * Get the earthquake url
     */
    public String getmUrl() {
        return mUrl;
    }

}


