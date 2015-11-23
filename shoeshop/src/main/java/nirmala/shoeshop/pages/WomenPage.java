package nirmala.shoeshop.pages;

import nirmala.shoeshop.browser.Browser;
import nirmala.shoeshop.pages.women.HeelsPage;
import nirmala.shoeshop.pages.women.SandalsPage;
import nirmala.shoeshop.pages.women.ShoesPage;

public class WomenPage {

	public static boolean IsAt() {
		return Browser.Driver().getTitle().equals("Women - ShoeFactory");
	}

	public static HeelsPage HeelsPage() {
		HeelsPage heelsPage = new HeelsPage();
		return heelsPage;
	}

	public static SandalsPage SandalsPage() {
		SandalsPage sandalsPage = new SandalsPage();
		return sandalsPage;
	}

	public static ShoesPage ShoesPage() {
		// TODO Auto-generated method stub
		return new ShoesPage();
	}

}
