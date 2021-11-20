import { ComponentFixture, TestBed } from '@angular/core/testing';

import { HeadComponenteComponent } from './head-componente.component';

describe('HeadComponenteComponent', () => {
  let component: HeadComponenteComponent;
  let fixture: ComponentFixture<HeadComponenteComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ HeadComponenteComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(HeadComponenteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
