import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TodaysChoresComponent } from './todays-chores.component';

describe('TodaysChoresComponent', () => {
  let component: TodaysChoresComponent;
  let fixture: ComponentFixture<TodaysChoresComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TodaysChoresComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(TodaysChoresComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
