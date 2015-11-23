package nirmala.shoeshop.pages.women;

import nirmala.shoeshop.browser.Browser;
//import nirmala.shoeshop.pages.WomenPage;

public class ShoesPage {

	public boolean IsAt() {
		return Browser.Driver().getTitle().equals("Shoes - ShoeFactory");
	}

	public CasualShoesPage CasualShoesPage() {
		return new CasualShoesPage();
	}

	public SportsShoesPage SportsShoes() {
		return new SportsShoesPage();
	}

	public FormalShoesPage FormalShoes() {
		return new FormalShoesPage();
	}

	public EthnicShoesPage EthnicShoes() {
		return new EthnicShoesPage();
	}

	
}
