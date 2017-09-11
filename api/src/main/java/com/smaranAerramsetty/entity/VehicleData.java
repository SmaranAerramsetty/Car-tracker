package com.smaranAerramsetty.entity;

import javax.persistence.*;
import java.util.UUID;

@Entity
@NamedQueries({
        //named queries here..
})
public class VehicleData {

    @Id
    @Column(columnDefinition = "VARCHAR(36)")
    private String id;

    @Column(unique = true)
    private String vin;         //while creating new data in tab check if vin already
                                //   exists, if yes just update last service date only.

    private String make;
    private String model;
    private int year;
    private int redlineRpm;
    private float maxFuelVolume;
    private String lastServiceDate;

    public VehicleData(){
        this.id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }


    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }   //if the vin no is same check for last service date.

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getRedlineRpm() {
        return redlineRpm;
    }

    public void setRedlineRpm(int redlineRpm) {
        this.redlineRpm = redlineRpm;
    }

    public float getMaxFuelVolume() {
        return maxFuelVolume;
    }

    public void setMaxFuelVolume(float maxFuelVolume) {
        this.maxFuelVolume = maxFuelVolume;
    }

    public String getLastServiceDate() {
        return lastServiceDate;
    }

    public void setLastServiceDate(String lastServiceDate) {
        this.lastServiceDate = lastServiceDate;
    }
}
