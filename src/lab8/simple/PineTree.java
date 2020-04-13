package lab8.simple;

import lab8.Plant;

public class PineTree implements Plant{

	@Override
	public double getOxigenAmountPerYear() {
		// TODO Auto-generated method stub
		return 2.2;
	}

	@Override
	public int getLifeTime() {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	public String getRepresentation() {
		// TODO Auto-generated method stub
		return "P";
	}

}
