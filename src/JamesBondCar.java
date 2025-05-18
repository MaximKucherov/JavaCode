public class JamesBondCar extends Car {

    @Override
    public int drive(int howlong) {
        int distance = howlong * 180;
        return distance;
    }
}
