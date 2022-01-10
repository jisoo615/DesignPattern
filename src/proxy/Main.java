package proxy;

public class Main {
	static public void main(String[] args) {
		Subject real = new RealSubject();
		Subject proxy1 = new Proxy(real);
		Subject proxy2 = new Proxy(real);
		Subject proxy3 = new Proxy(real);

		proxy1.action1();
		proxy2.action1();
		proxy3.action1();

		proxy1.action2();
		proxy2.action2();
		proxy3.action2();

		/*결과: 간단한 업무는 proxy가 하고 복잡한 업무는 실제가 한다
		간단한 업무 by proxy
		간단한 업무 by proxy
		간단한 업무 by proxy
		복잡한 업무 by real
		복잡한 업무 by real
		복잡한 업무 by real
		 */
	}

}
