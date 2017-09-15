import { Component, OnInit } from '@angular/core';
import { Router} from '@angular/router';

@Component({
  selector: 'app-features-list',
  templateUrl: './features-list.component.html',
  styleUrls: ['./features-list.component.css']
})
export class FeaturesListComponent implements OnInit {
  dummy;
  selectedOption;
  enteredVin;
  optionsList = [
    'Get individual vehicle info:',
    'See all HIGH alerts by VIN',
    'Spot Vehicle Geo-location tracks',
  ];
  constructor( private router: Router) { }

  ngOnInit() {
  }

  featHandler() {
      console.log('entered vin/option: ' + this.enteredVin + '/' + this.selectedOption );
      switch(this.selectedOption) {
        case 'Get individual vehicle info:': this.getVehicleByVin(this.enteredVin); break;
        case 'See all HIGH alerts by VIN': this.getHighAlertsByVin(this.enteredVin); break;
        case 'Spot Vehicle Geo-location tracks': this.getGeoLocation(this.enteredVin); break;
        default: console.log('Error: in user selection @FeaturesListComponent'); break;
      }
  }
  getVehicleByVin (vin) {
    console.log('getVehicleByVin called');
    this.dummy = this.router.navigate(['/vehicleByVin', vin]);
  }
  getHighAlertsByVin(vin) {
    this.dummy = this.router.navigate(['/highAlertsByVin', vin]);
  }
  getGeoLocation(vin) {
    this.dummy = this.router.navigate(['/track', vin]);
  }
}
