package com.smaranAerramsetty.service;

import com.smaranAerramsetty.entity.ReadingsData;
import com.smaranAerramsetty.entity.VehicleData;

import java.util.List;

public interface FindService {

    List<ReadingsData> findAllReadings(String vin);
    VehicleData findVehicleInfo (String vin);

}
