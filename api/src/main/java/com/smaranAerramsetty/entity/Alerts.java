package com.smaranAerramsetty.entity;

import javax.persistence.*;
import java.util.UUID;

@Entity
@NamedQueries({
        @NamedQuery(name = "Alerts.alertsList", query = "SELECT alerts FROM Alerts alerts "),
        @NamedQuery(name = "Alerts.alertsByVin", query = "SELECT alert FROM Alerts alert WHERE alert.carVin = :paramVin "),
        @NamedQuery(name = "Alerts.allHighAlerts", query = "SELECT alert FROM Alerts alert WHERE alert.priority = 'HIGH' "),
        @NamedQuery(name = "Alerts.highVinAlerts", query = "SELECT alert FROM Alerts alert WHERE alert.priority = 'HIGH' AND alert.carVin = :paramVin")
}
)
public class Alerts {

    @Id
    private String id;
    private String carVin;
    private String cause;
    private String priority;
    private String timestamp;


    public Alerts(String carVin, String cause, String priority, String Date){
        this.id = UUID.randomUUID().toString();
        this.carVin = carVin;
        this.cause = cause;
        this.priority = priority;
        this.timestamp = Date;

    }

    public String getId() {
        return id;
    }


    public String getCarVin() {
        return carVin;
    }

    public void setCarVin(String carVin) {
        this.carVin = carVin;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}
