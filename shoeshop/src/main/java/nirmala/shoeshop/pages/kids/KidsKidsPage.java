package nirmala.shoeshop.pages.kids;

import nirmala.shoeshop.browser.Browser;

public class KidsKidsPage {

	public boolean IsAt() {
		return Browser.Driver().getTitle().equals("Kids - ShoeFactory");
	}

}
