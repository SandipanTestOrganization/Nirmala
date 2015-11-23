package nirmala.shoeshop.pages.kids;

import nirmala.shoeshop.browser.Browser;

public class SchoolShoesPage {

	public boolean IsAt() {
		return Browser.Driver().getTitle().equals("School Shoes - ShoeFactory");
	}
}
