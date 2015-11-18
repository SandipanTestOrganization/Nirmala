package nirmala.shoeshop.pages.women;

import nirmala.shoeshop.browser.Browser;

public class HeelsPage {

	public boolean IsAt() {
		return Browser.Driver().getTitle().equals("Heels - ShoeFactory");
	}

	public HighHeelsPage HighHeelsPage() {
		return new HighHeelsPage();
	}

}
