import { Component, OnInit } from '@angular/core';
import {VehicleInfoService} from '../vehicle-info-service/vehicle-info.service';

@Component({
  selector: 'app-all-vehicles-info',
  templateUrl: './all-vehicles-info.component.html',
  styleUrls: ['./all-vehicles-info.component.css']
})
export class AllVehiclesInfoComponent implements OnInit {
  vehicleInfoData;
  constructor(vehicleInfoService: VehicleInfoService) {
    vehicleInfoService.getAllVehiclesInfo()
      .subscribe(vehicles => this.vehicleInfoData = vehicles);
  }

  ngOnInit() {
  }

}
