package nirmala.shoeshop.pages.women;

import nirmala.shoeshop.browser.Browser;

public class PointedHeels {

	public boolean IsAt() {
		return Browser.Driver().getTitle().equals("Pointed Heels - ShoeFactory");
	}

	
}
