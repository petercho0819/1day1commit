package problem4;

public class User {
	private Cellphone cellPhone = new Cellphone();
	public SmartPhone smartPhone = new SmartPhone();
	private boolean isCellPhone = false;
	App app = new App();
	
	public void powerOn() {
	
		cellPhone.powerOn();
		
	}

	public void Callbutton() {
		if(isCellPhone) {
			smartPhone.callbutton();
		}else {
			cellPhone.callbutton();
		}
		
		
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
			isCellPhone = true;
	}
	
}
