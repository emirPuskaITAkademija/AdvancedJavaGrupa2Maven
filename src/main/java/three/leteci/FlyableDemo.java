package three.leteci;

public class FlyableDemo {

    public static void main(String[] args) {
        Flyable flyable1 = FlyableFactory.bird();
        flyable1.fly();
        Flyable flyable2 = FlyableFactory.plane();
        flyable2.fly();
    }
}
