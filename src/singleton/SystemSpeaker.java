package singleton;

public class SystemSpeaker {
	private static SystemSpeaker instance;
	private int volume;
	private SystemSpeaker(){
		this.volume = 5;//기본 볼륨 5
	}

	public static SystemSpeaker getInstance() {
		if(instance==null) {
			instance = new SystemSpeaker();
			System.out.println("새로운 스피커 생성");
			return instance;
		}else {
			System.out.println("기존 스피커 생성");
			return instance;
		}
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}
	public int getVolume() {
		return this.volume;
	}

}
