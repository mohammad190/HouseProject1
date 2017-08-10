package mohammadAli;

public class Setup extends Information implements Basic,MoreInformation{
	
	
	final double tax = 1.25;
	private final double housePrice = 25888.55;
	public double totallprice() {
		double finalprice = housePrice + (housePrice * tax);
		System.out.println("The final house tax price is : " + finalprice);
		return finalprice;
	}
	static int count = 2;
	int size;
	public Setup() {
		count++;
	}
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		Setup.count = count;
	}
	public double mainhousePrice() {
		System.out.println("The final house price is " + housePrice);
		return housePrice;
	}
	public void HouseOwner() {
		System.out.println("The house owner name is Sarker");	
	}
	public void HouseNmae() {
		System.out.println("The house name is Onina");	
	}
	public void HouseColor() {	
		System.out.println("The house color is White");	
	}
	public void HousePrice() {
		System.out.println("The house price is $354,580 ");		
	}
	public void start() {
		System.out.println("Bye a land for makeing a new house");		
	}
	public void areaName() {
		System.out.println("I want to build this house in Nevada State");		
	}
	public void landSize() {
		System.out.println("This house landSize 2524 Square feet");		
	}
	public void HouseDecoration() {
		System.out.println("This House Decoration is beautiful");
	}
	public void HouseDesign() {
		System.out.println("This House Design made by engineer");	
	}
}
