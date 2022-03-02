package five.singleton;

/**
 * Dizajnirati klasu po čijem šablonu možemo zauzeti samo
 * jednu memorijsku lokaciju.
 * Odnosno jedan objekat može biti kreiran po šablonu klase Alien.
 *
 */
public class Alien {
    //EAGER
    private static Alien ALIEN = null;
    private Alien(){
        System.out.println("Kreiram vanzemaljca...");
    }

    public static Alien instance(){
        if(ALIEN == null){
            ALIEN = new Alien();
        }
        return ALIEN;
    }
}
