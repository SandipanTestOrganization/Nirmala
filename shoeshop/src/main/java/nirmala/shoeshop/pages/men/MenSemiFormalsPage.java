package nirmala.shoeshop.pages.men;

import nirmala.shoeshop.browser.Browser;

public class MenSemiFormalsPage {

	public boolean IsAt() {
		return Browser.Driver().getTitle().equals("Semi Formals - ShoeFactory");
	}

}
