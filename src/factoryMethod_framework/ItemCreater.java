package factoryMethod_framework;

public abstract class ItemCreater {

	//이 것이 팩토리 메소드 -> 템플릿 메소드의 형태를 하고 있다.
	public Item create() {
		Item item;

		requestItemInfo();
		item = createItem();
		createItemLog();

		return item;
	}

	//아이템을 생성하기 전에 db에서 아이템 정보를 요청합니다.
	abstract protected void requestItemInfo();

	//아이템 생성 후 아이템 복제 등의 불법을 방지하기 위해 db에 아이템 생성 정보를 남깁니다. (로그정보를 남겨라)
	abstract protected void createItemLog();

	//아이템을 생성하는 알고리즘
	abstract protected Item createItem();
}
