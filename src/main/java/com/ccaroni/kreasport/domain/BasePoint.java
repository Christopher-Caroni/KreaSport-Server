package com.ccaroni.kreasport.domain;


import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;

/**
 * Created by Master on 04/04/2017.
 */
public class BasePoint {

    @Id
    String id;
    String title;
    String description;
    double latitude;
    double longitude;

    public BasePoint() {
        id = new ObjectId().toString();
    }

    public BasePoint(String title, String description, double latitude, double longitude) {
        this();
        this.title = title;
        this.description = description;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    @Transient
    public double[] getLocation() {
        return new double[]{latitude, longitude};
    }

}
