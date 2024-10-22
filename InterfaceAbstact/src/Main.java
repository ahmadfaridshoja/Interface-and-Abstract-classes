//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Vehicle Car = new Car ("Chevy");
        Vehicle Mcycle = new Motorcycle("honda 150cc");
        Car.start();
        Car.honk();
        Car.stop();
        //.....
        Mcycle.start();
        Mcycle.honk();
        Mcycle.stop();
    }
}