package factory_concrete;

import java.util.Date;

import factoryMethod_framework.Item;
import factoryMethod_framework.ItemCreater;

public class HpCreater extends ItemCreater{

	@Override
	protected void requestItemInfo() {
		// TODO Auto-generated method stub
		System.out.println("db에서 회복물약의 정보를 가져옵니다.");

	}

	@Override
	protected void createItemLog() {
		// TODO Auto-generated method stub
		System.out.println("회복 물약을 새로 생성했습니다."+new Date());

	}

	@Override
	protected Item createItem() {
		// TODO Auto-generated method stub
		return new HpPotion();
	}

}
