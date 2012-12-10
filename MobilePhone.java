public class MobilePhone extends OldPhone {

	private String[] lastNumbers;

	public MobilePhone(String brand) {
		super(brand);
		lastNumbers = new String[10];
	}

	public void ringAlarm(String alarmTime) {
		System.out.println("Alarm Set For " + alarmTime);
	}

	private void playGame(String gameName) {
		System.out.println("Starting Game " + gameName);
	}

	public void printLastNumbers() {

		if (lastNumbers[0] != null) {
			for (int x = 0; x < 9; x++) {
				if (lastNumbers[x] != null) {
					System.out.println("Number " + (x + 1) + ". " + lastNumbers[x]);
				}
			}
		} else {
			System.out.println("No Numbers");
		}
	}

	@Override
	public void call(String number) {
		storeNumber(number);
		super.call(number);
	}

	public void storeNumber(String number) {
		//move the existing numbers down
		for (int x = 9; x > 0; x--) {
			lastNumbers[x] = lastNumbers[x - 1];
		}

		lastNumbers[0] = number;
	}
}