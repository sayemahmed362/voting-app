export interface Poll {
  id: number;
  title: string;
  options: OptionDetails[];
}

export interface OptionDetails {
  name: string;
  count: number;
}
