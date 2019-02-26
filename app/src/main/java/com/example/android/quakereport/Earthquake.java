package com.example.android.quakereport;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Earthquake {
    private double mMagnitude;
    private String mLocation;
    private long mTimeInMilliseconds;

    public Earthquake(double magnitude, String location, long timeInMilliseconds) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
    }

    public double getMagnitude() {
        return mMagnitude;
    }

    public String getLocation() {
        return mLocation;
    }

    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }
}
