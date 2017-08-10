package mohammadAli;

public class Decoration {
	private String window;
	private String LivingRoom;
	private int elevtor;
	private int bedroom;
	private double rent;
	private String Kitchen;
	
	public String getWindow() {
		return window;
	}
	public String getLivingRoom() {
		return LivingRoom;
	}
	public int getElevtor() {
		return elevtor;
	}
	public int getBedroom() {
		return bedroom;
	}
	public double getRent() {
		return rent;
	}
	public String getKitchen() {
		return Kitchen;
	}
	public void setWindow(String window) {
		this.window = window;
	}
	public void setLivingRoom(String livingRoom) {
		LivingRoom = livingRoom;
	}
	public void setElevtor(int elevtor) {
		this.elevtor = elevtor;
	}
	public void setBedroom(int bedroom) {
		this.bedroom = bedroom;
	}
	public void setRent(double rent) {
		this.rent = rent;
	}
	public void setKitchen(String kitchen) {
		Kitchen = kitchen;
	}
	
}
