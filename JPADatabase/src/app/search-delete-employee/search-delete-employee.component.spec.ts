import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SearchDeleteEmployeeComponent } from './search-delete-employee.component';

describe('SearchDeleteEmployeeComponent', () => {
  let component: SearchDeleteEmployeeComponent;
  let fixture: ComponentFixture<SearchDeleteEmployeeComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SearchDeleteEmployeeComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SearchDeleteEmployeeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
