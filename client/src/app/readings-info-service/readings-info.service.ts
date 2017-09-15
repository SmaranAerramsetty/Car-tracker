import { Injectable } from '@angular/core';
import {Http} from "@angular/http";
import {Observable} from "rxjs/Observable";

@Injectable()
export class ReadingsInfoService {
  // readingsData = [
  //   {
  //     "vin": "1HGCR2F3XFA027534",
  //     "latitude": 41.803194,
  //     "longitude": -88.144406,
  //     "timestamp": "2017-05-25T17:31:25.268Z",
  //     "fuelVolume": 1.5,
  //     "speed": 85,
  //     "engineHp": 240,
  //     "checkEngineLightOn": false,
  //     "engineCoolantLow": true,
  //     "cruiseControlOn": true,
  //     "engineRpm": 6300,
  //     "tires": {
  //       "frontLeft": 34,
  //       "frontRight": 36,
  //       "rearLeft": 29,
  //       "rearRight": 34
  //     }
  //   },
  //   {
  //     "vin": "1HGCR2F3XFA027534",
  //     "latitude": 41.803194,
  //     "longitude": -88.144406,
  //     "timestamp": "2017-05-25T17:31:25.268Z",
  //     "fuelVolume": 1.5,
  //     "speed": 85,
  //     "engineHp": 240,
  //     "checkEngineLightOn": true,
  //     "engineCoolantLow": false,
  //     "cruiseControlOn": false,
  //     "engineRpm": 6300,
  //     "tires": {
  //       "frontLeft": 34,
  //       "frontRight": 36,
  //       "rearLeft": 29,
  //       "rearRight": 34
  //     }
  //   },
  //   {
  //     "vin": "1HGCR2F3XFA027534",
  //     "latitude": 41.803194,
  //     "longitude": -88.144406,
  //     "timestamp": "2017-05-25T17:31:25.268Z",
  //     "fuelVolume": 1.5,
  //     "speed": 85,
  //     "engineHp": 240,
  //     "checkEngineLightOn": false,
  //     "engineCoolantLow": true,
  //     "cruiseControlOn": false,
  //     "engineRpm": 6300,
  //     "tires": {
  //       "frontLeft": 34,
  //       "frontRight": 36,
  //       "rearLeft": 29,
  //       "rearRight": 34
  //     }
  //   }
  // ];
  constructor(private http: Http) { }
  getReadingsInfo(vin): Observable<any[]> { // implement observable
    return this.http.get(`http://localhost:9090/api/car-tracker/readings-data/findAll/${vin}`)
      .map(response => response.json())
      .catch(error => Observable.throw(error.statusText));
  }
}
