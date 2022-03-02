package four.jdbc;

public class Elvis {

    private static Elvis elvisObjekat = null;

    private Elvis() {
        System.out.println("Poziva se konstruktor....");
    }

    public static Elvis createElvis() {
        if (elvisObjekat == null) {
            elvisObjekat = new Elvis();
        }
        return elvisObjekat;
    }
}
