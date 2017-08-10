package mohammadAli;

public class Main {
	
    // Interface, Abstract, Concreate, Main class
	public static void main(String[] args) {
		Basic mmm = new Setup();
		mmm.landSize();
		mmm.start();
		mmm.areaName();
		System.out.println("==================");
		MoreInformation nnn = new Setup();
		nnn.HouseOwner();
		nnn.HouseNmae();
		nnn.HouseColor();
		nnn.HousePrice();
		
		System.out.println("<<<<<<<<<<>>>>>>>>");
		
		//Encapsulation class
		Decoration ddd = new Decoration();
		ddd.setBedroom(4);
		ddd.setKitchen("Kitchen");
		ddd.setLivingRoom("livingRoom");
		ddd.setElevtor(1);
		ddd.setWindow("window");
		ddd.setRent(2500.00);
		
		
		System.out.println("This house has beedroom " + ddd.getBedroom()+"," + 
				" This house has one big " + ddd.getKitchen()+"," + 
				" This has one big " + ddd.getLivingRoom()+"," + 
				" This house elevator" + ddd.getElevtor()+"," + 
				" This house has 8 " + ddd.getWindow()+"," + 
				" This house rent is " + ddd.getRent()+",");
		System.out.println("=========================================");
		
		//Inheritance class
		HouseDecoration house1 = new HouseDecoration();
		house1.name();
		house1.house();
		house1.decoration();
		
		DesignHouse house2 = new DesignHouse();
		house2.name();
		house2.house();
		
		HousePaint house3 = new HousePaint();
		house3.name();
		house3.paint();
		System.out.println("________________________________________");
		
		// polymorphism class
		Area1 obj1 = new Area1();
		obj1.houseSize(25.36);
		obj1.houseSize(55,46);
		obj1.traingleHouse(51.6, 18.9, 19.8);
		
		// Method OverRiding
		Area2 obj2 = new Area2();
		obj2.HouseArea(968.0);	
		System.out.println("===========================================");
		
		//Final price and final price with tax.
		Setup nsetup = new Setup();
		nsetup.mainhousePrice();
		nsetup.totallprice();
		System.out.println("\n");
		//Static variable
		Setup ksetup = new Setup();
		System.out.println("This house lives " + ksetup.getCount() + " people. ");
		
		
		
	}
}
