package abst_factory_main;

import abst_factory.BikeFactory;
import abst_factory.Body;
import abst_factory.Wheel;
import abst_gt_bicycle.GtFactory;
import abst_sam_bicycle.SamFactory;

public class Main {

	public static void main(String[] args) {
		BikeFactory factory = new SamFactory();
		Body body = factory.createBody();
		Wheel wheel = factory.createWheel();
		System.out.println(body.getClass());
		System.out.println(wheel.getClass());

		factory = new GtFactory();
		body = factory.createBody();
		wheel = factory.createWheel();
		System.out.println(body.getClass());
		System.out.println(wheel.getClass());

	}

}
