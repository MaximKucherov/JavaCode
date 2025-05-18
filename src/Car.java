public class Car {
    public void start() {
        System.out.println("Двигатель запущен!");
    };

    public void stop() {
        System.out.println("Двигатель выключен!");
    };

    public int drive(int howlong) {
        int distance = howlong * 60;
        return distance;
    }

}
