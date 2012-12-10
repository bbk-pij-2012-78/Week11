
public class LecturerLauncher {

	public static void main(String[] args) {
		LecturerLauncher launcher = new LecturerLauncher();
		launcher.launch();
	}

	public void launch() {
		Lecturer lec = new Lecturer("John");

		System.out.println("Name: " + lec.getName());
		lec.teach("History");
	}
}