import { TestBed, inject } from '@angular/core/testing';

import { VehicleByVinService } from './vehicle-by-vin.service';

describe('VehicleByVinService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [VehicleByVinService]
    });
  });

  it('should be created', inject([VehicleByVinService], (service: VehicleByVinService) => {
    expect(service).toBeTruthy();
  }));
});
