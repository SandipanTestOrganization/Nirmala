package nirmala.shoeshop.pages.women;

import nirmala.shoeshop.browser.Browser;
import nirmala.shoeshop.pages.WomenPage;

public class SandalsPage {

	public boolean IsAt() {
		return Browser.Driver().getTitle().equals("Sandals - ShoeFactory");
	}

	public RegularSandalsPage Regular() {
		return new RegularSandalsPage();
	}

	public KittenSandalsPage Kitten() {
		return new KittenSandalsPage();
	}
	
	

}
