package problem4;

public class User {
	private Cellphone cellPhone = new Cellphone();
	public SmartPhone smartPhone = new SmartPhone();
	public static boolean isCellPhone;
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
		if(isCellPhone) {
			smartPhone.callbutton();
			
		}else {
		cellPhone.textButton();
		}
	}

	public void powerOff() {
		
		if(isCellPhone) {
			
			smartPhone.powerOff();
		}else {
		cellPhone.powerOff();
		}
	}

	public void internetButton() {
			smartPhone.internet();
	}

	public void mobileBuy() {
			smartPhone.mobileBuy();

	}
	
}
