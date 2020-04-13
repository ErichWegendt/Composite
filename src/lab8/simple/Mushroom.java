package lab8.simple;

import lab8.Plant;

public class Mushroom implements Plant {

	@Override
	public double getOxigenAmountPerYear() {
		// TODO Auto-generated method stub
		return 5.5;
	}

	@Override
	public int getLifeTime() {
		// TODO Auto-generated method stub
		return 5;
	}

	@Override
	public String getRepresentation() {
		// TODO Auto-generated method stub
		return "M";
	}

}
