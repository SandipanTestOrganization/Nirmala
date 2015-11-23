package nirmala.shoeshop.pages.kids;

import nirmala.shoeshop.browser.Browser;

public class SandelsPage {

	public boolean IsAt() {
		return Browser.Driver().getTitle().equals("Sandels - ShoeFactory");
	}

}
