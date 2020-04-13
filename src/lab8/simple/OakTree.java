package lab8.simple;

import lab8.Plant;

public class OakTree implements Plant {

	@Override
	public double getOxigenAmountPerYear() {
		// TODO Auto-generated method stub
		return 4.4;
	}

	@Override
	public int getLifeTime() {
		// TODO Auto-generated method stub
		return 4;
	}

	@Override
	public String getRepresentation() {
		// TODO Auto-generated method stub
		return "O";
	}

}
