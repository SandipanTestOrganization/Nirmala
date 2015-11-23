package nirmala.shoeshop.pages.women;

import nirmala.shoeshop.browser.Browser;

public class LowHeelsPage {

	public boolean IsAt() {
		return Browser.Driver().getTitle().equals("Low Heels - ShoeFactory");
	}
}
