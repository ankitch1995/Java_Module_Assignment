import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FavoriteLinksComponent } from './favorite-links.component';

describe('FavoriteLinksComponent', () => {
  let component: FavoriteLinksComponent;
  let fixture: ComponentFixture<FavoriteLinksComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ FavoriteLinksComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(FavoriteLinksComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
