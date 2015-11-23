package nirmala.shoeshop.pages.women;

import nirmala.shoeshop.browser.Browser;

public class EthnicShoesPage {

	public boolean IsAt() {
		return Browser.Driver().getTitle().equals("Ethnic Shoes - ShoeFactory");
	}
}
