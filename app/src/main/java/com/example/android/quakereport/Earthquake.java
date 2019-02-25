package com.example.android.quakereport;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Earthquake {
    private float mag;
    private String location;
    private Date date;

    public Earthquake(float mag, String location, long millis) {
        this.mag = mag;
        this.location = location;
        this.date = new Date(millis);
    }

    public float getMag() {
        return mag;
    }

    public String getLocation() {
        return location;
    }

    public Date getDate() {
        return date;
    }

    public String getStringDate() {
        return new SimpleDateFormat("MMM dd, YYYY", new Locale("en")).format(date);
    }
}
