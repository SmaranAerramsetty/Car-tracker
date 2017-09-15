import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AllReadingsInfoComponent } from './all-readings-info.component';

describe('AllReadingsInfoComponent', () => {
  let component: AllReadingsInfoComponent;
  let fixture: ComponentFixture<AllReadingsInfoComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AllReadingsInfoComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AllReadingsInfoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
