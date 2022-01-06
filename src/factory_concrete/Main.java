package factory_concrete;

import factoryMethod_framework.Item;
import factoryMethod_framework.ItemCreater;

public class Main {

	public static void main(String[] args) {
		ItemCreater creater;
		Item item;

		creater = new HpCreater();
		item = creater.create();
		item.use();

		creater = new MpCreater();
		item = creater.create();
		item.use();
	}

}
