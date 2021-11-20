import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ConteudoComponenteComponent } from './conteudo-componente.component';

describe('ConteudoComponenteComponent', () => {
  let component: ConteudoComponenteComponent;
  let fixture: ComponentFixture<ConteudoComponenteComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ConteudoComponenteComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ConteudoComponenteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
