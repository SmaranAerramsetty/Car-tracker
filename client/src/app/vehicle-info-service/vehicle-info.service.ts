import { Injectable } from '@angular/core';
import {Http} from '@angular/http';
import {Observable} from 'rxjs/Observable';
import "rxjs/add/operator/catch";
import "rxjs/add/operator/map";
import "rxjs/add/observable/throw";

@Injectable()
export class VehicleInfoService {
  vehicleData = [
    {
      "vin": "1HGCR2F3XFA027534",
      "make": "HONDA",
      "model": "ACCORD",
      "year": 2015,
      "redlineRpm": 5500,
      "maxFuelVolume": 15,
      "lastServiceDate": "2017-05-25T17:31:25.268Z"
    },
    {
      "vin": "WP1AB29P63LA60179",
      "make": "PORSCHE",
      "model": "CAYENNE",
      "year": 2015,
      "redlineRpm": 8000,
      "maxFuelVolume": 18,
      "lastServiceDate": "2017-03-25T17:31:25.268Z"
    }
  ];
  constructor(private http: Http) {

  }
  getAllVehiclesInfo(): Observable<any[]> {
    return this.http.get('http://localhost:9090/api/car-tracker/vehicle-data/all')
      .map(response => response.json())
      .catch(error => Observable.throw(error.statusText));
  }

}
