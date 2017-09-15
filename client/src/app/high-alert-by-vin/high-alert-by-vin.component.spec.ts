import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { HighAlertByVinComponent } from './high-alert-by-vin.component';

describe('HighAlertByVinComponent', () => {
  let component: HighAlertByVinComponent;
  let fixture: ComponentFixture<HighAlertByVinComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ HighAlertByVinComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(HighAlertByVinComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
