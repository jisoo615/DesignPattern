package abst_sam_bicycle;

import abst_factory.BikeFactory;
import abst_factory.Body;
import abst_factory.Wheel;

public class SamFactory implements BikeFactory{

	@Override
	public Body createBody() {
		// TODO Auto-generated method stub
		return new SamBody();
	}

	@Override
	public Wheel createWheel() {
		// TODO Auto-generated method stub
		return new SamWheel();
	}

}
