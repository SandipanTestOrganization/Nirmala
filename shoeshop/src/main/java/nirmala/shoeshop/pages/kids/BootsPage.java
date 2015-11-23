package nirmala.shoeshop.pages.kids;

import nirmala.shoeshop.browser.Browser;

public class BootsPage {

	public boolean IsAt() {
		return Browser.Driver().getTitle().equals("boots - ShoeFactory");
	}

}
