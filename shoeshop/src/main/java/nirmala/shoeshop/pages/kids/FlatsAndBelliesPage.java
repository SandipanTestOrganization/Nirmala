package nirmala.shoeshop.pages.kids;

import nirmala.shoeshop.browser.Browser;

public class FlatsAndBelliesPage {

	public boolean IsAt() {
		return Browser.Driver().getTitle().equals("Flats and bellies - ShoeFactory");
	}

}
