package strategy;

public class GameCharacter {
	//접근점
	private Weapon weapon;//무기를 가지는 게임캐리턱

	//교환기능
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	public void attack() {

		if(weapon == null) {
			System.out.println("맨손 공격");
		}else {
			//델리게이트 위임하다(기능을 넘겨주다)
			this.weapon.attack();
		}
	}

}
