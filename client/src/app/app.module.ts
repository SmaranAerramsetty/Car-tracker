import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { AllVehiclesInfoComponent } from './all-vehicles-info/all-vehicles-info.component';
import {FormsModule} from '@angular/forms';
import {HttpModule} from '@angular/http';
import {RouterModule, Routes} from '@angular/router';
import {VehicleInfoService} from './vehicle-info-service/vehicle-info.service';
import { AllReadingsInfoComponent } from './all-readings-info/all-readings-info.component';
import { ErrorInfoComponent } from './error-info/error-info.component';
import {ReadingsInfoService} from './readings-info-service/readings-info.service';
import {FeaturesListComponent} from './features-list/features-list.component';
import { VehicleByVinComponent } from './vehicle-by-vin/vehicle-by-vin.component';
import {VehicleByVinService} from './vehicle-by-vin-service/vehicle-by-vin.service';
import { HighAlertByVinComponent } from './high-alert-by-vin/high-alert-by-vin.component';
import {AlertServiceService} from './alert-services/alert-service.service';
import { TrackComponent } from './track/track.component';
import {TrackService} from './track-service/track.service';
import { AgmCoreModule } from '@agm/core';

const appRoutes: Routes = [
  {path: 'home', component: AllVehiclesInfoComponent},
  {path: 'readings/:vin', component: AllReadingsInfoComponent},  // set to /:paramVin
  {path: 'feat', component: FeaturesListComponent},
  {path: 'vehicleByVin/:vin', component: VehicleByVinComponent},
  {path: 'highAlertsByVin/:vin', component: HighAlertByVinComponent},
  {path: 'track/:vin', component: TrackComponent},
  {path: '', redirectTo: 'home', pathMatch: 'full'},
  {path: '**', component: ErrorInfoComponent}
];

@NgModule({
  declarations: [
    AppComponent,
    AllVehiclesInfoComponent,
    AllReadingsInfoComponent,
    ErrorInfoComponent,
    FeaturesListComponent,
    VehicleByVinComponent,
    HighAlertByVinComponent,
    TrackComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule,
    RouterModule.forRoot(appRoutes),
    AgmCoreModule.forRoot({
      apiKey: 'AIzaSyBOEHzu_kRjzTSK3DduCPJOqY6WYKWnVXA'
    })
  ],
  providers: [VehicleInfoService, ReadingsInfoService, VehicleByVinService, AlertServiceService, TrackService],
  bootstrap: [AppComponent]
})
export class AppModule { }
