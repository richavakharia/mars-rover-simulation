package transport;

public class Vehicle {
	
	private int nWheels;
	private double xPosition;
	private double yPosition;
	
	public Vehicle(int num){
		nWheels = num;
		System.out.println("Vehicle constructor");
	}
	@Override
	public String toString() {
		//TODO Auto-generated method stub
		return super.toString();	
	}
	public double getxPosition() {
		return xPosition;
	}
	public double getyPosition() {
		return yPosition;
	}
	public void setPosition(double xPosition, double yPosition) {
		this.xPosition = xPosition;
		this.yPosition = yPosition;
	}
	
	public void changePositionBy(double xDelta, double yDelta) {
		xDelta += xPosition;
		yDelta += yPosition;
	}
	


}
