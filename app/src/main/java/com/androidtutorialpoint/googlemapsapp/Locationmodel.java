
package com.androidtutorialpoint.googlemapsapp;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.apache.commons.lang.builder.ToStringBuilder;

public class Locationmodel {

    @SerializedName("id")
    @Expose
    private long id;
    @SerializedName("deviceId")
    @Expose
    private String deviceId;
    @SerializedName("latitudeValue")
    @Expose
    private double latitudeValue;
    @SerializedName("longitudeValue")
    @Expose
    private double longitudeValue;
    @SerializedName("lastUpdatedTime")
    @Expose
    private long lastUpdatedTime;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Locationmodel() {
    }

    /**
     * 
     * @param id
     * @param latitudeValue
     * @param lastUpdatedTime
     * @param longitudeValue
     * @param deviceId
     */
    public Locationmodel(long id, String deviceId, double latitudeValue, double longitudeValue, long lastUpdatedTime) {
        this.id = id;
        this.deviceId = deviceId;
        this.latitudeValue = latitudeValue;
        this.longitudeValue = longitudeValue;
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * 
     * @return
     *     The id
     */
    public long getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The deviceId
     */
    public String getDeviceId() {
        return deviceId;
    }

    /**
     * 
     * @param deviceId
     *     The deviceId
     */
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    /**
     * 
     * @return
     *     The latitudeValue
     */
    public double getLatitudeValue() {
        return latitudeValue;
    }

    /**
     * 
     * @param latitudeValue
     *     The latitudeValue
     */
    public void setLatitudeValue(double latitudeValue) {
        this.latitudeValue = latitudeValue;
    }

    /**
     * 
     * @return
     *     The longitudeValue
     */
    public double getLongitudeValue() {
        return longitudeValue;
    }

    /**
     * 
     * @param longitudeValue
     *     The longitudeValue
     */
    public void setLongitudeValue(double longitudeValue) {
        this.longitudeValue = longitudeValue;
    }

    /**
     * 
     * @return
     *     The lastUpdatedTime
     */
    public long getLastUpdatedTime() {
        return lastUpdatedTime;
    }

    /**
     * 
     * @param lastUpdatedTime
     *     The lastUpdatedTime
     */
    public void setLastUpdatedTime(long lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
