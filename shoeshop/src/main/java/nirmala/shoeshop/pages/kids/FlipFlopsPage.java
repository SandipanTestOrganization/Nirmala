package nirmala.shoeshop.pages.kids;

import nirmala.shoeshop.browser.Browser;

public class FlipFlopsPage {

	public boolean IsAt() {
		return Browser.Driver().getTitle().equals("Flip Flops - ShoeFactory");
	}

}
