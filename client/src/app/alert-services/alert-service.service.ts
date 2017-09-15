import { Injectable } from '@angular/core';
import {Http} from '@angular/http';
import {Observable} from 'rxjs/Observable';

@Injectable()
export class AlertServiceService {

  constructor(private http: Http) { }

  getAlerts(vin): Observable<any[]> {
    return this.http.get(`http://localhost:9090/api/car-tracker/alerts/${vin}`)
      .map(response => response.json())
      .catch(error => Observable.throw(error.statusText));
  }
}
