package nirmala.shoeshop.pages.women;

import nirmala.shoeshop.browser.Browser;

public class FormalShoesPage {

	public boolean IsAt() {
		return Browser.Driver().getTitle().equals("Formal Shoes - ShoeFactory");
	}
	
	

}
