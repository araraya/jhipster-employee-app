import dayjs from 'dayjs/esm';

import { IEmployee, NewEmployee } from './employee.model';

export const sampleWithRequiredData: IEmployee = {
  id: 7813,
};

export const sampleWithPartialData: IEmployee = {
  id: 74743,
  gender: 'Mexican Administrator Rustic',
  birthLocation: 'empower e-tailers internet',
  address: 'Implementation Pizza',
};

export const sampleWithFullData: IEmployee = {
  id: 31845,
  name: 'View National Analyst',
  gender: 'Representative user-centric',
  birthLocation: 'open-source pixel',
  birthDate: dayjs('2024-06-30'),
  address: 'Tuna',
  phone: '541.629.7547',
};

export const sampleWithNewData: NewEmployee = {
  id: null,
};

Object.freeze(sampleWithNewData);
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);
