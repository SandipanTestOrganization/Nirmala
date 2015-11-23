package nirmala.shoeshop.pages.women;

import nirmala.shoeshop.browser.Browser;

public class RegularSandalsPage {

	public boolean IsAt() {
		return Browser.Driver().getTitle().equals("Regular - ShoeFactory");
	}
	
	

}
