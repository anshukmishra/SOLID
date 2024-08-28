package LSP.refactored;

interface AirConditionable{
    String openAirConditioning();
};

class Car {
    public String run() {
        return "Running";
    }
};

class Ferrari extends Car implements AirConditionable {
    @Override
    public String openAirConditioning() {
        return "Opened";
    }
};

class Murat131 extends Car {
};

public class RefactoredCarInfo {
    public static void main(String[] args) {
        Ferrari car = new Ferrari();
        System.out.println(car.run());
        System.out.println(car.openAirConditioning());

        Car car1 = new Murat131();
        System.out.println(car1.run());
    }
};


