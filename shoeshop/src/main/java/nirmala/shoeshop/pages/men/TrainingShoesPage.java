package nirmala.shoeshop.pages.men;

import nirmala.shoeshop.browser.Browser;

public class TrainingShoesPage {

	public boolean IsAt() {
		return Browser.Driver().getTitle().equals("Training Shoes - ShoeFactory");
	}

}
