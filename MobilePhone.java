public class MobilePhone extends OldPhone {

	private String[] lastNumbers;

	public MobilePhone() {
		lastNumbers = new String[9];
	}

	public void ringAlarm(String alarmTime) {
		System.out.println("Alarm Set For " + alarmTime);
	}

	public void playGame(String gameName) {
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
}