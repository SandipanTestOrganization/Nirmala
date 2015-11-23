package nirmala.shoeshop.pages.men;

import nirmala.shoeshop.browser.Browser;

public class LofersPage {

	public boolean IsAt() {
		return Browser.Driver().getTitle().equals("Loafers - ShoeFactory");
	}

}
