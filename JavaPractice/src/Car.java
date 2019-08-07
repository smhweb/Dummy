
public class Car {
	
	int maxSpeed = 100;
	int minSpeed = 0;
	
	public int getMaxSpeed() {
		return this.maxSpeed;
	}
	
	public void setMaxSpeed(int newMaxSpeed) {
		this.maxSpeed = newMaxSpeed;
	}
	
	public void upgradeMaxSpeed() {
		setMaxSpeed(getMaxSpeed() + 10);
	}
	
	public void printVariables() {
		System.out.println("This is maxSpeed:  "+ maxSpeed);
	}

	public static void main(String[] args) {

		Car tommyCar = new Car();
		tommyCar.printVariables();
		tommyCar.setMaxSpeed(20);
		tommyCar.getMaxSpeed();
		tommyCar.printVariables();
		tommyCar.setMaxSpeed(30);
		tommyCar.getMaxSpeed();
		tommyCar.printVariables();

		
	}

}
