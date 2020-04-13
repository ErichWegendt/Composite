package lab8.simple;

import lab8.Plant;

public class Grass implements Plant {

	@Override
	public double getOxigenAmountPerYear() {
		// TODO Auto-generated method stub
		return 3.3;
	}

	@Override
	public int getLifeTime() {
		// TODO Auto-generated method stub
		return 3;
	}

	@Override
	public String getRepresentation() {
		// TODO Auto-generated method stub
		return "G";
	}

}
