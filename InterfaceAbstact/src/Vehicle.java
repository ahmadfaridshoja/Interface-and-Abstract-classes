public abstract class Vehicle implements Drivable{
    protected String model;

    public Vehicle(String model) {
        this.model = model;
    }
    abstract void honk();
}
