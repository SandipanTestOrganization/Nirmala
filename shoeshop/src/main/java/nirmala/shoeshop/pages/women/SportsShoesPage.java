package nirmala.shoeshop.pages.women;

import nirmala.shoeshop.browser.Browser;

public class SportsShoesPage {

	public boolean IsAt() {
		return Browser.Driver().getTitle().equals("Sports Shoes - ShoeFactory");
	}

	
}
