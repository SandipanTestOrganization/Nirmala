package nirmala.shoeshop.pages.men;

import nirmala.shoeshop.browser.Browser;
//import nirmala.shoeshop.pages.MenPage;

public class AtheleticsPage {

	public boolean IsAt() {
		return Browser.Driver().getTitle().equals("Atheletics - ShoeFactory");
	}

	public OutDoorAndHikingShoesPage OutDoorAndHikingShoes() {
		return new OutDoorAndHikingShoesPage();
	}

	public RunningShoesPage RunningShoes() {
		return new RunningShoesPage();
	}

	public InDoorSportsShoesPage InDoorSportsShoes() {
		return new InDoorSportsShoesPage();
	}

	public TrainingShoesPage TrainingShoes() {
		return new TrainingShoesPage();
	}
}
