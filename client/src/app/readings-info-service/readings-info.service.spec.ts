import { TestBed, inject } from '@angular/core/testing';

import { ReadingsInfoService } from './readings-info.service';

describe('ReadingsInfoService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [ReadingsInfoService]
    });
  });

  it('should be created', inject([ReadingsInfoService], (service: ReadingsInfoService) => {
    expect(service).toBeTruthy();
  }));
});
