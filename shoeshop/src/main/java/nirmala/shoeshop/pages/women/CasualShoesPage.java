package nirmala.shoeshop.pages.women;

import nirmala.shoeshop.browser.Browser;

public class CasualShoesPage {

	public boolean IsAt() {
		return Browser.Driver().getTitle().equals("Casual shoes - ShoeFactory");
	}
}
