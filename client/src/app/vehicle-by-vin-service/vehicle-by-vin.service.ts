import { Injectable } from '@angular/core';
import {Observable} from 'rxjs/Observable';
import {Http} from '@angular/http';

@Injectable()
export class VehicleByVinService {

  constructor(private http: Http) { }
  getInfo(vin): Observable<any> {
    console.log('veicleInfoByService Vin called');
    return this.http.get(`http://localhost:9090/api/car-tracker/vehicle-data/info/${vin}`)
      .map(response => response.json())
      .catch(error => Observable.throw(error.statusText));
  }
}
