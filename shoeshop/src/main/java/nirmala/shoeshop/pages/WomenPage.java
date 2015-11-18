package nirmala.shoeshop.pages;

import nirmala.shoeshop.browser.Browser;
import nirmala.shoeshop.pages.women.HeelsPage;

public class WomenPage {

	public static boolean IsAt() {
		return Browser.Driver().getTitle().equals("Women - ShoeFactory");
	}

	public static HeelsPage HeelsPage() {
		HeelsPage heelsPage = new HeelsPage();
		return heelsPage;
	}

}
