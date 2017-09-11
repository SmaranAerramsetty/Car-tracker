package com.smaranAerramsetty.repository;

import com.smaranAerramsetty.entity.Alerts;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class AlertRepositoryImpl implements AlertRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Alerts> alertsList() {
        TypedQuery<Alerts> query = entityManager.createNamedQuery("Alerts.alertsList", Alerts.class);
        return query.getResultList();
    }

    public List<Alerts> alertsByVin(String vin) {
        TypedQuery<Alerts> query = entityManager.createNamedQuery("Alerts.alertsByVin", Alerts.class);
        query.setParameter("paramVin", vin);
        return query.getResultList();
    }

    public List<Alerts> allHighAlerts() {
        TypedQuery<Alerts> query = entityManager.createNamedQuery("Alerts.allHighAlerts", Alerts.class);
        return query.getResultList();
    }

    public List<Alerts> highVinAlerts(String vin) {
        TypedQuery<Alerts> query = entityManager.createNamedQuery("Alerts.highVinAlerts", Alerts.class);
        query.setParameter("paramVin", vin);
        return query.getResultList();
    }
}
