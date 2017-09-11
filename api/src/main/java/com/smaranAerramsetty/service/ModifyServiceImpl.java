package com.smaranAerramsetty.service;

import com.smaranAerramsetty.entity.Alerts;
import com.smaranAerramsetty.entity.ReadingsData;
import com.smaranAerramsetty.entity.VehicleData;
import com.smaranAerramsetty.exceptions.BadRequestException;
import com.smaranAerramsetty.repository.AlertRepository;
import com.smaranAerramsetty.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Transactional
@Service
public class ModifyServiceImpl implements ModifyService {

    @Autowired
    private VehicleRepository vehicleRepository;

    @Autowired
    private AlertRepository alertRepository;

    public ReadingsData createNewReading(ReadingsData readingsData) {

        //create if unavailable, else check alerts(update alert db) then create new reading any way
        String vin = readingsData.getVin();
        List<ReadingsData> existing = vehicleRepository.findAllReadings(vin);
        if (existing != null){
            VehicleData vehicleAttr = vehicleRepository.findVehicleInfo(vin);
            if(vehicleAttr.getRedlineRpm() < readingsData.getEngineRpm() ){
                Alerts alert = new Alerts(vin, "Engine RPM", "HIGH", readingsData.getTimestamp());
            }
            if ( readingsData.getFuelVolume() < (0.1 * vehicleAttr.getMaxFuelVolume()) ){
                Alerts alert = new Alerts(vin, "Low Fuel", "MEDIUM", readingsData.getTimestamp());
            }
            int fl = readingsData.getTirePressure().getFrontLeft();
            int fr = readingsData.getTirePressure().getFrontRight();
            int rl = readingsData.getTirePressure().getRearLeft();
            int rr = readingsData.getTirePressure().getRearRight();
            if ( (fl < 32 || fl > 36) || (fr < 32 || fr > 36) || (rl < 32 || rl > 36) || (rr < 32 || rr > 36) ){
                Alerts alert = new Alerts(vin, "Tire Pressure", "LOW", readingsData.getTimestamp());
            }
            if (readingsData.isEngineCoolantLow()==true || readingsData.isCheckEngineLightOn()==true){
                Alerts alert = new Alerts(vin, "Engine Lights", "LOW", readingsData.getTimestamp());
            }

        }

        return vehicleRepository.createNewReading(readingsData);
    }

    public VehicleData createNewVehicle(VehicleData vehicleData) {

        VehicleData existing = vehicleRepository.findVehicleInfo(vehicleData.getVin());
        if(existing != null)
            throw new BadRequestException("Vehicle with vin: " + vehicleData.getId() + " already exists..");
        else
            return vehicleRepository.createNewVehicle(vehicleData);
    }



}
