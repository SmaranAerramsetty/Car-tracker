import { Component, OnInit } from '@angular/core';
import {ActivatedRoute} from '@angular/router';
import {AlertServiceService} from '../alert-services/alert-service.service';

@Component({
  selector: 'app-high-alert-by-vin',
  templateUrl: './high-alert-by-vin.component.html',
  styleUrls: ['./high-alert-by-vin.component.css']
})
export class HighAlertByVinComponent implements OnInit {

  alertInfo;
  constructor(private route: ActivatedRoute, alertService: AlertServiceService) {
    this.route.params.subscribe(
      params => {
        alertService.getAlerts(params.vin)
          .subscribe(
            alertInfo => this.alertInfo = alertInfo
          );
      }
    );
  }

  ngOnInit() {
  }

}
//&callback=initMap --> look this val
// <script async defer src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBOEHzu_kRjzTSK3DduCPJOqY6WYKWnVXA&sensor=false" type="text/javascript"></script>
