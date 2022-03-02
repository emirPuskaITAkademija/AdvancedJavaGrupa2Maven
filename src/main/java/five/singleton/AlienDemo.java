package five.singleton;

public class AlienDemo {
    public static void main(String[] args) {
        Alien alien = Alien.instance();
        Alien alien1 = Alien.instance();
        Alien alien2 = Alien.instance();
        System.out.println(alien.hashCode());
        System.out.println(alien1.hashCode());
        System.out.println(alien2.hashCode());
    }
}
