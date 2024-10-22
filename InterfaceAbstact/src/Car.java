public class Car extends Vehicle{
    public Car(String model){
        super(model);

    }

    @Override
    void honk() {
        System.out.println("Car" + model + "is Starting.");

    }

    @Override
    public void start() {
        System.out.println("Car " + model + "is Stopping. ");
    }

    @Override
    public void stop() {
        System.out.println("Car " + model + "is Honking!");
    }
}
