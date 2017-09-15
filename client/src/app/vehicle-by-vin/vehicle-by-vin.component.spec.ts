import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { VehicleByVinComponent } from './vehicle-by-vin.component';

describe('VehicleByVinComponent', () => {
  let component: VehicleByVinComponent;
  let fixture: ComponentFixture<VehicleByVinComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ VehicleByVinComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(VehicleByVinComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
