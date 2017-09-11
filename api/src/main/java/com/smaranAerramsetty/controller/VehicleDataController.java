package com.smaranAerramsetty.controller;

import com.smaranAerramsetty.entity.VehicleData;
import com.smaranAerramsetty.service.FindService;
import com.smaranAerramsetty.service.ModifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class VehicleDataController {

    @Autowired
    private FindService findService;

    @Autowired
    private ModifyService modifyService;

    @RequestMapping(method = RequestMethod.GET, value = "/vehicle-data/info/{vin}")
    public VehicleData findVehicleInfo(@PathVariable("vin") String vin){
        //return null;
        return findService.findVehicleInfo(vin);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public VehicleData createNewVehicle(@RequestBody VehicleData vehicleData){
        return modifyService.createNewVehicle(vehicleData);
    }



}
