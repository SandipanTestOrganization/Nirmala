package nirmala.shoeshop.pages.kids;

import nirmala.shoeshop.browser.Browser;

public class ClogsPage {

	public boolean IsAt() {
		return Browser.Driver().getTitle().equals("Clogs - ShoeFactory");
	}

}
