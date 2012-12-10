public class RestrictedSmartPhone extends SmartPhone {

	public RestrictedSmartPhone(String brand) {
		super(brand);
	}

	@Override
	public void playGame(String gameName) {
		System.out.println("Starting Game " + gameName);
	}

}