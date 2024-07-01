import dayjs from 'dayjs/esm';
import { ICompany } from 'app/entities/company/company.model';
import { ICar } from 'app/entities/car/car.model';

export interface IEmployee {
  id: number;
  name?: string | null;
  gender?: string | null;
  birthLocation?: string | null;
  birthDate?: dayjs.Dayjs | null;
  address?: string | null;
  phone?: string | null;
  company?: Pick<ICompany, 'id' | 'name'> | null;
  cars?: Pick<ICar, 'id' | 'name'>[] | null;
}

export type NewEmployee = Omit<IEmployee, 'id'> & { id: null };
