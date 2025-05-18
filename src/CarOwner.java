public class CarOwner {

    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.stop();
        int distance = car.drive(50);

        System.out.println("Дистанция составляет " + distance);

        JamesBondCar jamesBondCar = new JamesBondCar();
        int result = jamesBondCar.drive(50);
        System.out.println("Дистанция составляет " + result);
    }


}
