package com.smaranAerramsetty.entity;

import javax.persistence.*;
import java.util.UUID;

@Entity
@NamedQueries({
        @NamedQuery(name = "ReadingsData.findAllReadings", query = "SELECT readings from ReadingsData readings WHERE readings.vin=:paramVin")
})
public class ReadingsData {

    @Id
    @Column(columnDefinition = "VARCHAR(36)")
    private String id;

    private String vin;
    private String timestamp;
    private float fuelVolume;
    private int speed;
    private boolean cruiseControlOn;
    private int engineHp;
    private boolean checkEngineLightOn;
    private boolean engineCoolantLow;
    private int engineRpm;



    @OneToOne
    private TirePressure tirePressure;

    public ReadingsData(){
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
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public float getFuelVolume() {
        return fuelVolume;
    }

    public void setFuelVolume(float fuelVolume) {
        this.fuelVolume = fuelVolume;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isCruiseControlOn() {
        return cruiseControlOn;
    }

    public void setCruiseControlOn(boolean cruiseControlOn) {
        this.cruiseControlOn = cruiseControlOn;
    }

    public int getEngineHp() {
        return engineHp;
    }

    public void setEngineHp(int engineHp) {
        this.engineHp = engineHp;
    }

    public boolean isCheckEngineLightOn() {
        return checkEngineLightOn;
    }

    public void setCheckEngineLightOn(boolean checkEngineLightOn) {
        this.checkEngineLightOn = checkEngineLightOn;
    }

    public boolean isEngineCoolantLow() {
        return engineCoolantLow;
    }

    public void setEngineCoolantLow(boolean engineCoolantLow) {
        this.engineCoolantLow = engineCoolantLow;
    }

    public int getEngineRpm() {
        return engineRpm;
    }

    public void setEngineRpm(int engineRpm) {
        this.engineRpm = engineRpm;
    }

    public TirePressure getTirePressure() {
        return tirePressure;
    }

    public void setTirePressure(TirePressure tirePressure) {
        this.tirePressure = tirePressure;
    }
}
