package templateMethod;

public class Main {

	public static void main(String[] args) {
		AbstGameConnectHelper helper = new DefaultGameConnectHelper();

		String encodedInfo = "hoya 887639 angel88";
		helper.requestConeection(encodedInfo);
	}

}
