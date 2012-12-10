
public class PhoneLauncher {

	public static void main(String[] args) {
		PhoneLauncher launcher = new PhoneLauncher();
		launcher.launch();
	}

	public void launch() {
		SmartPhone sp = new SmartPhone("Samsung");

		//OldPhone methods
		sp.call("07786246207");
		sp.call("007786246207");
		sp.call("07564654155");
		sp.call("007646546488");
		System.out.println("Brand: " + sp.getBrand().toString());

		//MobilePhone methods
		sp.ringAlarm("07:30");
		sp.playGame("Snake");
		sp.printLastNumbers();

		//SmartPhone methods
		sp.browseWeb("http://www.google.co.uk");
		System.out.println(sp.findPosition().toString());
	}
}