package nirmala.shoeshop.pages.kids;

import nirmala.shoeshop.browser.Browser;

public class SportsAndCasualShoesPage {

	public boolean IsAt() {
		return Browser.Driver().getTitle().equals("Sporsts and Casual Shoes - ShoeFactory");
	}

}
