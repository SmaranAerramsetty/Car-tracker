package com.smaranAerramsetty.service;

import com.smaranAerramsetty.entity.ReadingsData;
import com.smaranAerramsetty.entity.VehicleData;

public interface ModifyService {

    ReadingsData createNewReading(ReadingsData readingsData);
    VehicleData createNewVehicle(VehicleData vehicleData);

}
