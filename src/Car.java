public class Car {
    private String make;
    private String model;
    private String colour;
    private int numberOfDoors;
    private double engineSize;
    private int maxSpeed;
    private boolean started;

    public Car() {

    }

    public Car(String make, String model, String colour, int numberOfDoors, double engineSize, int maxSpeed) {
        this.make = make;
        this.model = model;
        this.colour = colour;
        this.numberOfDoors = numberOfDoors;
        this.engineSize = engineSize;
        this.maxSpeed = maxSpeed;
        this.started = started;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public double getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(double engineSize) {
        this.engineSize = engineSize;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }


    public boolean isStarted() {
        return started;
    }

    public void setStarted(boolean started) {
        this.started = started;
    }

    public void startCar(){
        started = true;
        System.out.println("Car is started");
    }

    public void stopCar(){
        started = false;
        System.out.println("Car is stopped");
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", colour='" + colour + '\'' +
                ", numberOfDoors=" + numberOfDoors +
                ", engineSize=" + engineSize +
                ", maxSpeed=" + maxSpeed +
                ", started=" + started +
                '}';
    }

    public static void main(String[] args) {
        Car car1 = new Car("Ford", "Fiesta", "Blue", 4, 1.2, 110);
        Car car2 = new Car("Peugeot", "308", "Silver", 4, 1.8, 130);
        Car car3 = new Car("Ferrari", "F4", "Red", 2, 2.8, 230);
        car1.setStarted(false);
        car2.setStarted(true);
        car3.setStarted(false);
        System.out.println(car1.toString());
        System.out.println(car2.toString());
        System.out.println(car3.toString());
    }
}
