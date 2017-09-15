import { Component, OnInit } from '@angular/core';
import {ActivatedRoute} from '@angular/router';
import {VehicleByVinService} from '../vehicle-by-vin-service/vehicle-by-vin.service';

@Component({
  selector: 'app-vehicle-by-vin',
  templateUrl: './vehicle-by-vin.component.html',
  styleUrls: ['./vehicle-by-vin.component.css']
})
export class VehicleByVinComponent implements OnInit {

  vehicleInfo = {
    vin: null,
    make: null,
    year: null,
    redlineRpm: null,
    maxFuelVolume: null,
    lastServiceDate: null
  };
  constructor(private route: ActivatedRoute, vehicleByVinService: VehicleByVinService) {
    console.log('vehicleInfo component called');
    this.route.params.subscribe(
      params => {
        vehicleByVinService.getInfo(params.vin)
          .subscribe(
            vehicleInfo => this.vehicleInfo = vehicleInfo
          );
      }
    );
  }

  ngOnInit() {
  }

}
