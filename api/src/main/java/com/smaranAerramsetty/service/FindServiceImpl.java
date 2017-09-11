package com.smaranAerramsetty.service;

import com.smaranAerramsetty.entity.ReadingsData;
import com.smaranAerramsetty.entity.VehicleData;
import com.smaranAerramsetty.exceptions.ResourceNotFoundException;
import com.smaranAerramsetty.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(readOnly = true)
@Service
public class FindServiceImpl implements FindService {

    @Autowired
    private VehicleRepository vehicleRepository;


    public List<ReadingsData> findAllReadings(String vin) {

        VehicleData existing = vehicleRepository.findVehicleInfo(vin);
        if(existing != null)
            return vehicleRepository.findAllReadings(vin);
        else
        {
            throw new ResourceNotFoundException("Vehicle with vin: " + vin + ". Not in records..");
        }
    }

    public VehicleData findVehicleInfo(String vin) {

        VehicleData existing = vehicleRepository.findVehicleInfo(vin);
        if(existing != null)
            return existing;
        else
        {
            throw new ResourceNotFoundException("Vehicle with vin: " + vin + ". Not in records..");
        }
    }
}
