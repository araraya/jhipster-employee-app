export interface ICar {
  id: number;
  name?: string | null;
  brand?: string | null;
  price?: number | null;
}

export type NewCar = Omit<ICar, 'id'> & { id: null };
