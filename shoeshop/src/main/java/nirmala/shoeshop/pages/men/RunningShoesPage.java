package nirmala.shoeshop.pages.men;

import nirmala.shoeshop.browser.Browser;

public class RunningShoesPage {

	public boolean IsAt() {
		return Browser.Driver().getTitle().equals("Running Shoes - ShoeFactory");
	}

}
