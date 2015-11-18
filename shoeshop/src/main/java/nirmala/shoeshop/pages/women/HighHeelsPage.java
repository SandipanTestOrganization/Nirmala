package nirmala.shoeshop.pages.women;

import nirmala.shoeshop.browser.Browser;

public class HighHeelsPage {

	public boolean IsAt() {
		return Browser.Driver().getTitle().equals("High Heels - ShoeFactory");
	}

}
