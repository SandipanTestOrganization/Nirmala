package nirmala.shoeshop.pages.men;

import nirmala.shoeshop.browser.Browser;
import nirmala.shoeshop.pages.MenPage;

public class MenSneakersPage {

	public boolean IsAt() {
		return Browser.Driver().getTitle().equals("Sneakers - ShoeFactory");
	}

	public MenSneakersRegularsPage Regulars() {
		// TODO Auto-generated method stub
		return new MenSneakersRegularsPage();
	}

}
