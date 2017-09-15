import { Component, OnInit } from '@angular/core';
import {ActivatedRoute} from "@angular/router";
import {ReadingsInfoService} from "../readings-info-service/readings-info.service";


@Component({
  selector: 'app-track',
  templateUrl: './track.component.html',
  styleUrls: ['./track.component.css']
})
export class TrackComponent implements OnInit {
  lat = 51.678418;
  lng = 7.809007;
  readingsInfoData;
  constructor(private route: ActivatedRoute, private readingsService: ReadingsInfoService) {
    this.route.params.subscribe(
      params => {
        readingsService.getReadingsInfo(params.vin)
          .subscribe(
            readings => this.readingsInfoData = readings
          );
      }
    );
  }

  ngOnInit() {

  }

}
