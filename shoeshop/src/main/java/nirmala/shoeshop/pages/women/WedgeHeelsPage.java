package nirmala.shoeshop.pages.women;

import nirmala.shoeshop.browser.Browser;

public class WedgeHeelsPage {

	public boolean IsAt() {
		return Browser.Driver().getTitle().equals("Wedge Heels - ShoeFactory");
	}

	
}
