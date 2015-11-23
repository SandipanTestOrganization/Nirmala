package nirmala.shoeshop.pages.men;

import nirmala.shoeshop.browser.Browser;

public class MenSneakersRegularsPage {

	public boolean IsAt() {
		return Browser.Driver().getTitle().equals("Regulars - ShoeFactory");
	}

}
