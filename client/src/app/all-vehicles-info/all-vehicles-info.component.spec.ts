import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AllVehiclesInfoComponent } from './all-vehicles-info.component';

describe('AllVehiclesInfoComponent', () => {
  let component: AllVehiclesInfoComponent;
  let fixture: ComponentFixture<AllVehiclesInfoComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AllVehiclesInfoComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AllVehiclesInfoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should be created', () => {
    expect(component).toBeTruthy();
  });
});
