package com.smaranAerramsetty.repository;

import com.smaranAerramsetty.entity.ReadingsData;
import com.smaranAerramsetty.entity.VehicleData;

import java.util.List;

public interface VehicleRepository {
    List<ReadingsData> findAllReadings(String vin);
    VehicleData findVehicleInfo (String vin);
    ReadingsData createNewReading(ReadingsData readingsData);
    VehicleData createNewVehicle(VehicleData vehicleData);
}
