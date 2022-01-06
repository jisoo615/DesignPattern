package templateMethod;

public abstract class AbstGameConnectHelper {
	protected abstract String doSecurity(String string);
	protected abstract boolean authentication(String id, String password);
	protected abstract int authorization(String userName);
	protected abstract String connect(String info);

	//템플릿 메소드
	public String requestConeection(String encodedInfo) {
		//보안작업 복호화
		String decodedInfo = doSecurity(encodedInfo);
		String[] id_pw_name = decodedInfo.split(" ");
		//인증과정 복호화 된 것을 가지고 아이디 비번에 할당.
		if(!authentication(id_pw_name[0], id_pw_name[1])) {
			throw new Error("로그인 실패");
		}

		int i = authorization(id_pw_name[2]);
		switch(i) {
		case -1: throw new Error("셧다운");

		case 0: //게임 매니저
			break;
		case 1: //유료 회원
			break;
		case 2: //무료 회원
			break;
		case 3: //권한 없음
			break;
		default://기타 상황
			break;
		}

		return connect(decodedInfo);
	}
}
