import java.util.*;

public class SmartPhone extends MobilePhone {


	public void browseWeb(String url) {
		System.out.println("Browsing to " + url);
	}

	public Vector findPosition() {
		return new Vector(149);
	}

	@Override
	public void call(String number) {
		//System.out.println("In SmartPhone.call");
		if (number.startsWith("00")) {
			System.out.println("Calling " + number + " through the internet to save money");
		} else {
			super.call(number);
		}
	}
}