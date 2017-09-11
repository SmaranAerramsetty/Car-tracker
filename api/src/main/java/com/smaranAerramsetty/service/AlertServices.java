package com.smaranAerramsetty.service;

import com.smaranAerramsetty.entity.Alerts;
import org.springframework.stereotype.Service;

import java.util.List;


public interface AlertServices {

   List<Alerts> alertsList ();
   List<Alerts> alertsByVin(String vin);
   List<Alerts> allHighAlerts();
   List<Alerts> highVinAlerts(String vin);
}
