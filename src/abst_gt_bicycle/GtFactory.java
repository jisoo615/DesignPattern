package abst_gt_bicycle;

import abst_factory.BikeFactory;
import abst_factory.Body;
import abst_factory.Wheel;

public class GtFactory implements BikeFactory{

	@Override
	public Body createBody() {
		return new GtBody();
	}

	@Override
	public Wheel createWheel() {
		return new GtWheel();
	}

}
