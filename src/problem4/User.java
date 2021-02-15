package problem4;

public class User {
	private Cellphone cellPhone = new Cellphone();
	private SmartPhone smartPhone = new SmartPhone();
	
	public void powerOn() {
	
		cellPhone.powerOn();
		
	}

	public void Callbutton() {
		cellPhone.callbutton();
		
	}

	public void textButton() {
		cellPhone.textButton();
		
	}

	public void powerOff() {
		cellPhone.powerOff();
		
	}

	public void internetButton() {
			smartPhone.internet();
	}

	public void mobileBuy() {
			smartPhone.mobileBuy();
	}
	
}
