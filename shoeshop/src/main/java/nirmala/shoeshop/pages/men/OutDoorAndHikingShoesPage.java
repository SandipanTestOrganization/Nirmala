package nirmala.shoeshop.pages.men;

import nirmala.shoeshop.browser.Browser;

public class OutDoorAndHikingShoesPage {

	public boolean IsAt() {
		return Browser.Driver().getTitle().equals("Outdoor &amp; Hiking Shoes - ShoeFactory");		
	}
}
