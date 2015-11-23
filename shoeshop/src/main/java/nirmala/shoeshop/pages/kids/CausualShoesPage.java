package nirmala.shoeshop.pages.kids;

import nirmala.shoeshop.browser.Browser;

public class CausualShoesPage {

	public boolean IsAt() {
		return Browser.Driver().getTitle().equals("Casual Shoes - ShoeFactory");
	}

}
