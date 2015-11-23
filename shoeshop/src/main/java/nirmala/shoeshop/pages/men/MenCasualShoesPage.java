package nirmala.shoeshop.pages.men;

import nirmala.shoeshop.browser.Browser;

public class MenCasualShoesPage {

	public boolean IsAt() {
		return Browser.Driver().getTitle().equals("Casual Shoes - ShoeFactory");
	}

}
