package com.smaranAerramsetty.controller;

import com.smaranAerramsetty.entity.ReadingsData;
import com.smaranAerramsetty.service.FindService;
import com.smaranAerramsetty.service.ModifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class ReadingsDataController {

    @Autowired
    private FindService findService;

    @Autowired
    private ModifyService modifyService;

    @RequestMapping(method = RequestMethod.GET, value = "/readings-data/findAll/{vin}")
    public List<ReadingsData> findAllReadings(@PathVariable("vin") String vin){
        return findService.findAllReadings(vin);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ReadingsData createNewReading(@RequestBody ReadingsData readingsData){
        return modifyService.createNewReading(readingsData);
    }

}
