package com.smaranAerramsetty.controller;

import com.smaranAerramsetty.entity.Alerts;
import com.smaranAerramsetty.service.AlertServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping(value = "/alerts")
public class AlertsController {

    @Autowired
    private AlertServices alertServices;

    @RequestMapping(method = RequestMethod.GET, value = "/all")
    public List<Alerts> alertsList (){
        return alertServices.alertsList();

    }

    @RequestMapping(method = RequestMethod.GET, value = "/{vin}")
    public List<Alerts> alertsByVin (@PathVariable("vin") String vin){
        return alertServices.alertsByVin(vin);

    }

    @RequestMapping(method = RequestMethod.GET, value = "/high/all")
    public List<Alerts> allHighAlerts (){
        return alertServices.allHighAlerts();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/high/{vin}")
    public List<Alerts> highVinAlerts(@PathVariable("vin") String vin) {
        return alertServices.highVinAlerts(vin);
    }
}