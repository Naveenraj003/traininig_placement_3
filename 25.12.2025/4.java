class Vehicle {
    void speed() {
        System.out.println("Vehicle speed");
    }
}

class Bike extends Vehicle {
    @Override
    void speed() {
        System.out.println("Bike speed: 80 km/h");
    }

    public static void main(String[] args) {
        Vehicle v = new Bike();
        v.speed();
    }
}
