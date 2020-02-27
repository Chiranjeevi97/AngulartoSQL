import { TestBed } from '@angular/core/testing';

import { AlterServiceService } from './alter-service.service';

describe('AlterServiceService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: AlterServiceService = TestBed.get(AlterServiceService);
    expect(service).toBeTruthy();
  });
});
