package factory_concrete;

import factoryMethod_framework.Item;

public class MpPotion implements Item{

	@Override
	public void use() {
		System.out.println("마력 회복됨");

	}

}
