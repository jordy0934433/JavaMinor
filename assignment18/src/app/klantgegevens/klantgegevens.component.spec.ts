import { ComponentFixture, TestBed } from '@angular/core/testing';

import { KlantgegevensComponent } from './klantgegevens.component';

describe('KlantgegevensComponent', () => {
  let component: KlantgegevensComponent;
  let fixture: ComponentFixture<KlantgegevensComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ KlantgegevensComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(KlantgegevensComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
