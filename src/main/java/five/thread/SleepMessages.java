package five.thread;

public class SleepMessages {
    public static void main(String[] args) throws InterruptedException {
        String[] poruke = {
                "Svima nam je dosta za danas",
                "Ne samo za danas..nego i šire..",
                "Potreban nam je odmor od ovih tema..",
                "Trebamo malo pričati o nogometu i navijačima..."
        };
        for(String poruka: poruke){
            System.out.println(poruka);
            Thread.sleep(4000);
        }
    }
}
