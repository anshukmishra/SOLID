package LSP;

abstract class Car {
    public String run() {
        return "Running";
    }

    public abstract String openAirConditioning();
};

class Ferrari extends Car {

    @Override
    public String openAirConditioning() {
        return "Opened";
    }
};

class Murat131 extends Car {

    @Override
    public String openAirConditioning() {
        throw new NullPointerException("Don't have AC in this car");
    }
};

public class CarInfo {
    public static void main(String[] args) {
        Car car = new Ferrari();
        System.out.println(car.run());
        System.out.println(car.openAirConditioning());

        car = new Murat131();
        System.out.println(car.run());
        System.out.println(car.openAirConditioning()); // Throws NotImplementedException
    }
};

//Hero you could see child has not the basic functionality of Parent Class
