package nirmala.shoeshop.menu;

public class TopNavigationBar {

	public static class Women{
		public static void Select() {
			MenuSelector.Select(MenuBar.WOMEN, MenuBar.SubMenu.NONE);	
		}
		public static class Heels{
			public static void Select() {
				MenuSelector.Select(MenuBar.WOMEN, MenuBar.SubMenu.WOMEN_HEELS);
			}
			public static class HighHeels{

				public static void Select() {
					MenuSelector.Select(MenuBar.WOMEN, MenuBar.SubMenu.WOMEN_HEELS_HIGHHEELS);
				}
			}
			public static class LowHeels{

				public static void Select() {
					MenuSelector.Select(MenuBar.WOMEN, MenuBar.SubMenu.WOMEN_HEELS_LOWHEELS);
				}				
			}
			public static class PointedHeels{

				public static void Select() {
					MenuSelector.Select(MenuBar.WOMEN, MenuBar.SubMenu.WOMEN_HEELS_POINTEDHEELS);					
				}
			}
			public static class WedgeHeels{
				
				public static void Select(){
					MenuSelector.Select(MenuBar.WOMEN, MenuBar.SubMenu.WOMEN_HEELS_WEDGEHEELS);
				}
			}
		}
		
		public static class Sandals{
			public static void Select(){
				MenuSelector.Select(MenuBar.WOMEN, MenuBar.SubMenu.WOMEN_SANDALS);
			}
			public static class Regular{
				
				public static void Select() {
					MenuSelector.Select(MenuBar.WOMEN, MenuBar.SubMenu.WOMEN_SANDALS_REGULAR);
				}
			}
			public static class Kitten{

				public static void Select() {
					MenuSelector.Select(MenuBar.WOMEN, MenuBar.SubMenu.WOMEN_SANDALS_KITTEN);
					
				}
				
			}
		}
		
		public static class Shoes{
			public static void Select(){
				MenuSelector.Select(MenuBar.WOMEN, MenuBar.SubMenu.WOMEN_SHOES);
			}
			public static class CasualShoes{
				public static void Select(){
					MenuSelector.Select(MenuBar.WOMEN, MenuBar.SubMenu.WOMEN_SHOES_CASUALSHOE);
				}
			}
			public static class SportsShoes{
				public static void Select(){
					MenuSelector.Select(MenuBar.WOMEN, MenuBar.SubMenu.WOMEN_SHOES_SPORTSHOES);
				}
			}
			public static class FormalShoes{
				public static void Select(){
					MenuSelector.Select(MenuBar.WOMEN, MenuBar.SubMenu.WOMEN_SHOES_FORMALSHOES);
				}
			}
			public static class EthnicShoes{
				public static void Select(){
					MenuSelector.Select(MenuBar.WOMEN, MenuBar.SubMenu.WOMEN_SHOES_ETHINICSHOES);
				}
			}
		}
	}

	public static class Men{
		public static void Select(){
			MenuSelector.Select(MenuBar.MEN, MenuBar.SubMenu.NONE);
		}
		public static class Shoes{
			public static void Select(){
				MenuSelector.Select(MenuBar.MEN, MenuBar.SubMenu.MEN_SHOES);
			}
			public static class CasualShoes{
				public static void Select(){
					MenuSelector.Select(MenuBar.MEN, MenuBar.SubMenu.MEN_SHOES_CASULASHOES);
				}
			}
			public static class FormalShoes{
				public static void Select(){
					MenuSelector.Select(MenuBar.MEN, MenuBar.SubMenu.MEN_SHOES_FORMALSHOES);
				}
			}
			public static class SemiFormals{
				public static void Select(){
					MenuSelector.Select(MenuBar.MEN, MenuBar.SubMenu.MEN_SHOES_SEMIFORMALS);
				}
			}
		}
		public static class Sneakers{
			public static void Select(){
				MenuSelector.Select(MenuBar.MEN, MenuBar.SubMenu.MEN_SNEAKERS);
			}
			public static class Regulars{
				public static void Select() {
					MenuSelector.Select(MenuBar.MEN, MenuBar.SubMenu.MEN_SNEAKERS_REGULARS);
				}
			}
		}
		public static class Atheletics{
			public static void Select(){
				MenuSelector.Select(MenuBar.MEN, MenuBar.SubMenu.MEN_ATHELETICS);
			}
			public static class OutDoorAndHikingShoes{
				public static void Select() {
					MenuSelector.Select(MenuBar.MEN, MenuBar.SubMenu.MEN_ATHELETICS_OUTDOORANDHIKINGSHOES);					
				}				
			}
			public static class RunningShoes{
				public static void Select() {
					MenuSelector.Select(MenuBar.MEN, MenuBar.SubMenu.MEN_ATHELETICS_RUNNINGSHOES);
				}				
			}
			public static class InDoorSportsShoes{
				public static void Select() {
					MenuSelector.Select(MenuBar.MEN, MenuBar.SubMenu.MEN_ATHELETICS_INDOORSPORTSHOES);
				}				
			}
			public static class TrainingShoes{
				public static void Select() {
					MenuSelector.Select(MenuBar.MEN, MenuBar.SubMenu.MEN_ATHELETICS_TRANNINGSHOES);
				}				
			}
		}
		public static class Lofers{
			public static void Select(){
				MenuSelector.Select(MenuBar.MEN, MenuBar.SubMenu.MEN_LOAFERS);
			}
		}
	}
	
	public static class Kids{
		public static void Select() {
			MenuSelector.Select(MenuBar.KIDS, MenuBar.SubMenu.NONE);			
		}
		public static class Boys{
			public static void Select(){
				MenuSelector.Select(MenuBar.KIDS, MenuBar.SubMenu.KIDS_BOYS);
			}
			public static class Boots{
				public static void Select() {
					MenuSelector.Select(MenuBar.KIDS, MenuBar.SubMenu.KIDS_BOYS_BOOTS);					
				}
				
			}
			public static class CausualShoes{
				public static void Select() {
					MenuSelector.Select(MenuBar.KIDS, MenuBar.SubMenu.KIDS_BOYS_CASUALSHOE);					
				}
				
			}
			public static class FlipFlops{
				public static void Select() {
					MenuSelector.Select(MenuBar.KIDS, MenuBar.SubMenu.KIDS_BOYS_FLIPFLOPS);					
				}
				
			}
			public static class Sandels{
				public static void Select() {
					MenuSelector.Select(MenuBar.KIDS, MenuBar.SubMenu.KIDS_BOYS_SANDELS);
				}
				
			}
			public static class SchoolShoes{
				public static void Select() {
					MenuSelector.Select(MenuBar.KIDS, MenuBar.SubMenu.KIDS_BOYS_SCHOOLSHOES);
				}
				
			}
			public static class SportsShoes{
				public static void Select() {
					MenuSelector.Select(MenuBar.KIDS, MenuBar.SubMenu.KIDS_BOYS_SPORTSHOES);
				}
				
			}
		}
		
		public static class Girls{
			public static void Select(){
				MenuSelector.Select(MenuBar.KIDS, MenuBar.SubMenu.KIDS_GIRLS);
			}
			public static class Sandels{
				public static void Select() {
					MenuSelector.Select(MenuBar.KIDS, MenuBar.SubMenu.KIDS_GIRLS_SANDELS);					
				}
				
			}
			public static class Clogs{
				public static void Select(){
					MenuSelector.Select(MenuBar.KIDS, MenuBar.SubMenu.KIDS_GIRLS_CLOGS);
				}
			}
			public static class FlatsAndBellies{
				public static void Select(){
					MenuSelector.Select(MenuBar.KIDS, MenuBar.SubMenu.KIDS_GIRLS_FLATANDBELLIES);
				}
			}
			public static class SportsAndCasualShoes{
				public static void Select(){
					MenuSelector.Select(MenuBar.KIDS, MenuBar.SubMenu.KIDS_GIRLS_SPORTSANDCASUALSHOES);
				}
			}
		}
		
		public static class Kid{
			public static void Select(){
				MenuSelector.Select(MenuBar.KIDS, MenuBar.SubMenu.KIDS_KID);
			}
		}
	}
}
