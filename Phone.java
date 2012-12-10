/**
* A phone makes calls
*/
public interface Phone {
	/**
	* Just print on the screen: "Calling <number>...".
	*/
	void call(String number);

	/**
	* Returns the brand name of the phone".
	*/
	String getBrand();
}