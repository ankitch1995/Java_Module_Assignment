import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MoviesToWatchComponent } from './movies-to-watch.component';

describe('MoviesToWatchComponent', () => {
  let component: MoviesToWatchComponent;
  let fixture: ComponentFixture<MoviesToWatchComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MoviesToWatchComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(MoviesToWatchComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
