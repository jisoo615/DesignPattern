package templateMethod;

public class DefaultGameConnectHelper extends AbstGameConnectHelper{

	@Override
	protected String doSecurity(String string) {
		String decoded = "id pasword userName";
		System.out.print("강화된 알고리즘을 이용한 ");//추가
		System.out.println("디코드 단계");

		return decoded;
	}

	@Override
	protected boolean authentication(String id, String password) {
		System.out.println("로그인 확인중");
		return true;
	}

	@Override
	protected int authorization(String userName) {
		System.out.println("권한 확인 단계");
		//청소년인인데 밤10시가 넘었다면 return -1;
		System.out.println("청소년인지 확인, 밤 10시인지도 확인");
		return 0;
	}

	@Override
	protected String connect(String info) {
		System.out.println("마지막 접속 단계");
		return "나머지 필요한 정보";
	}

}
