package nirmala.shoeshop.pages.men;

import nirmala.shoeshop.browser.Browser;

public class InDoorSportsShoesPage {

	public boolean IsAt() {
		return Browser.Driver().getTitle().equals("Indoor Sports Shoes - ShoeFactory");
	}

}
