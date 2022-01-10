package proxy;

public class RealSubject implements Subject {

	//간단한 적게 드는 일
	@Override
	public void action1() {
		System.out.println("간단한 업무 by real");
	}

	//리소스가 많이 드는 일, 네트워크 메모리
	@Override
	public void action2() {
		System.out.println("복잡한 업무 by real");
	}

}
