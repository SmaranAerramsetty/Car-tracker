package com.smaranAerramsetty.repository;

import com.smaranAerramsetty.entity.ReadingsData;
import com.smaranAerramsetty.entity.VehicleData;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class VehicleRepositoryImpl implements VehicleRepository{

    @PersistenceContext
    private EntityManager entityManager;

    public List<ReadingsData> findAllReadings(String vin) {

        TypedQuery<ReadingsData> query = entityManager.createNamedQuery("ReadingsData.findAllReadings", ReadingsData.class);
        query.setParameter("paramVin", vin);
        return query.getResultList();
    }

    public VehicleData findVehicleInfo(String vin) {
       return entityManager.find(VehicleData.class, vin);
    }

    public ReadingsData createNewReading(ReadingsData readingsData) {
        entityManager.persist(readingsData);
        return readingsData;
    }

    public VehicleData createNewVehicle(VehicleData vehicleData) {

        entityManager.persist(vehicleData);
        return vehicleData;
    }
}
