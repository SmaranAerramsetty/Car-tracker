import { Component, OnInit } from '@angular/core';
import {ReadingsInfoService} from '../readings-info-service/readings-info.service';
import {ActivatedRoute} from '@angular/router';

@Component({
  selector: 'app-all-readings-info',
  templateUrl: './all-readings-info.component.html',
  styleUrls: ['./all-readings-info.component.css']
})
export class AllReadingsInfoComponent implements OnInit {
  readingsInfoData;
  constructor(private route: ActivatedRoute , readingsInfoService: ReadingsInfoService) {
    this.route.params.subscribe(
      params => {
        readingsInfoService.getReadingsInfo(params.vin)
          .subscribe(
            readings => this.readingsInfoData = readings
          );
      }
    );
  }
  ngOnInit() {
  }

}
