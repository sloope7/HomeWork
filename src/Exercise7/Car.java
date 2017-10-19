package Exercise7;

public class Car {
	 Engine engine;
	    BodyCar bodyCar;
	    Transmission transmission;
	    FuelTank fuelTank;
	    int maxSpeed;
	    boolean isCarStarted;
	    boolean isRun;
	    int currentGear = 0;
	    String brand;
	    String color;
	    String carNumber;

	    public Car(Transmission transmission, FuelTank fuelTank, int maxSpeed) {
	        this.transmission = transmission;
	        this.fuelTank = fuelTank;
	        this.maxSpeed = maxSpeed;
	    }

	    public void startTheCar(){
	        if(!isCarStarted && currentGear == 0 && fuelTank.amountOfFuelAtTheMoment > 0){
	            isCarStarted = true;
	            System.out.println("Mashina zavelas");
	        }
	    }

	    public void go(){
	        if(isCarStarted == true){
	            currentGear++;
	            isRun = true;
	            System.out.println("Mashina poehala");
	        }
	    }

	    public void stop(){
	        if(isRun == true){
	            isRun = false;
	            currentGear = 0;
	            System.out.println("Mashina ostanovilas");
	        }
	    }

	    public void muffleTheCar(){
	        if(isRun == true){
	            stop();
	            isCarStarted = false;
	            System.out.println("Mashina zaglushena");

	        }else{
	            isCarStarted = false;
	            System.out.println("Mashina zaglushena");
	        }
	    }

	    public void changeGear(int switchGear){
	        if (isRun == false) {
	            currentGear++;
	            System.out.println("Vklyuchena peredacha " + currentGear);

	        }else{
	            if (Math.abs(switchGear - currentGear) <= 3){
	                currentGear = switchGear;
	                System.out.println("Vklyuchena peredacha " + currentGear);
	            }
	        }
	    }

	    public void refuel(int countOfLiters){
	        if(fuelTank.amountOfFuelAtTheMoment + countOfLiters <= fuelTank.maximumVolumeOfFuelTank){
	           fuelTank.amountOfFuelAtTheMoment += countOfLiters;
	        }
	    }

	    public int currentSpeed(){
	        return (maxSpeed / transmission.numberOfGears) * currentGear;
	    }

}
