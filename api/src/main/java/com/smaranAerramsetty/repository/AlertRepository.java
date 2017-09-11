package com.smaranAerramsetty.repository;

import com.smaranAerramsetty.entity.Alerts;

import java.util.List;

public interface AlertRepository {
    List<Alerts> alertsList ();
    List<Alerts> alertsByVin(String vin);
    List<Alerts> allHighAlerts();
    List<Alerts> highVinAlerts(String vin);
}
