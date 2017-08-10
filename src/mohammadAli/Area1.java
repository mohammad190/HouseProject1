package mohammadAli;

public class Area1 {

	// area of house
	public double houseSize(double num) {
		double answer = num * num;
		System.out.println("The area of house : " + answer + " Square feet ");
		return answer;	
	}
	//area of rectangle land
	public double houseSize(double length, double width) {
		double answer = length * width;
		System.out.println("The area of rectangle house : " + answer+ " Square feet " );
		return answer;
	}
	// area of  triangle house
	public double traingleHouse(Double base, double height, double half) {
		double answer = base * height * half;
		System.out.println("The area of triangle  house is : " + answer + " Square feet ");
		return answer;
	}

}
