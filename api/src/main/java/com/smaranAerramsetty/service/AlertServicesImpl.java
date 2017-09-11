package com.smaranAerramsetty.service;

import com.smaranAerramsetty.entity.Alerts;
import com.smaranAerramsetty.repository.AlertRepository;
import com.smaranAerramsetty.repository.AlertRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class AlertServicesImpl implements AlertServices{

    @Autowired
    private AlertRepository alertRepository;


    public List<Alerts> alertsList() {
        return alertRepository.alertsList();
    }

    public List<Alerts> alertsByVin(String vin) {
        return alertRepository.alertsByVin(vin);
    }

    public List<Alerts> allHighAlerts() {
        return alertRepository.allHighAlerts();
    }

    public List<Alerts> highVinAlerts(String vin) {
        return alertRepository.highVinAlerts(vin);
    }
}
