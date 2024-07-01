import { ICompany, NewCompany } from './company.model';

export const sampleWithRequiredData: ICompany = {
  id: 32440,
};

export const sampleWithPartialData: ICompany = {
  id: 90002,
  address: 'Functionality Awesome',
};

export const sampleWithFullData: ICompany = {
  id: 48552,
  name: 'sensor',
  address: 'Granite',
  phone: '745.224.1522',
};

export const sampleWithNewData: NewCompany = {
  id: null,
};

Object.freeze(sampleWithNewData);
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);
