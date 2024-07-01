import { ICar, NewCar } from './car.model';

export const sampleWithRequiredData: ICar = {
  id: 96848,
};

export const sampleWithPartialData: ICar = {
  id: 26423,
  name: '24/7 collaborative Loan',
  price: 42812,
};

export const sampleWithFullData: ICar = {
  id: 30253,
  name: 'web-enabled fuchsia',
  brand: 'Soft payment',
  price: 18809,
};

export const sampleWithNewData: NewCar = {
  id: null,
};

Object.freeze(sampleWithNewData);
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);
