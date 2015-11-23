package nirmala.shoeshop.pages.women;

import nirmala.shoeshop.browser.Browser;

public class KittenSandalsPage {

	public boolean IsAt() {
		return Browser.Driver().getTitle().equals("Kitten - ShoeFactory");
	}
}
