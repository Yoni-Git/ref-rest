package com.refugee.restroom.events.domain;

import java.util.Date;

public class Event {
    private String name ;
    private String desctiption;
    private Date start;
    private int zip;
    private double latitude;
    private double longitude;
    private String street;


    public Event(String name, String desctiption, Date start, int zip, double latitude, double longitude, String street) {
        this.name = name;
        this.desctiption = desctiption;
        this.start = start;
        this.zip = zip;
        this.latitude = latitude;
        this.longitude = longitude;
        this.street = street;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesctiption() {
        return desctiption;
    }

    public void setDesctiption(String desctiption) {
        this.desctiption = desctiption;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return "Event{" +
                "name='" + name + '\'' +
                '}';
    }
}
