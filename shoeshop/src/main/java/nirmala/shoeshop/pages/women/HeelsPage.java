package nirmala.shoeshop.pages.women;

import nirmala.shoeshop.browser.Browser;
//import nirmala.shoeshop.pages.WomenPage;

public class HeelsPage {

	public boolean IsAt() {
		return Browser.Driver().getTitle().equals("Heels - ShoeFactory");
	}

	public HighHeelsPage HighHeelsPage() {
		return new HighHeelsPage();
	}
	
	public LowHeelsPage LowHeelsPage(){
		return new LowHeelsPage();
	}

	public PointedHeels PointedHeels() {
		return new PointedHeels();
	}

	public WedgeHeelsPage WedgeHeels() {
		return new WedgeHeelsPage();
	}	
}
