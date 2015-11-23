package nirmala.shoeshop.pages.men;

import nirmala.shoeshop.browser.Browser;

public class MenFormalShoesPage {

	public boolean IsAt() {
		return Browser.Driver().getTitle().equals("Formal Shoes - ShoeFactory");
	}

}
