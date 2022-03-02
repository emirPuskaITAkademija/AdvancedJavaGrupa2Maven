package six.thread;

public class SimpleThreadDemo {

    public static void main(String[] args) {
        threadConsumeMessage("Upošljavam uposlenika ovog..Dosta mi je više..");
        MessageConsumer messageConsumer = new MessageConsumer();
        Thread thread = new Thread(messageConsumer);
        long strpljenje = 1000*10;
        long startTime = System.currentTimeMillis();
        thread.start();
        threadConsumeMessage("Čekam sad uposlenika da obradi važne poruke...");
        while (thread.isAlive()){
            long periodČekanja = System.currentTimeMillis()-startTime;
            if(periodČekanja>strpljenje && thread.isAlive()){
                threadConsumeMessage("Umoran sam od čekanja...prekidam te");
                thread.interrupt();
            }
        }


    }

    static void threadConsumeMessage(String message) {
        String threadName = Thread.currentThread().getName();
        System.out.format("%s: %s%n", threadName, message);
    }

    static class MessageConsumer implements Runnable{
        @Override
        public void run() {
            String[] važnePoruke = {
                    "Core Java Programming",
                    "Advanced Java Programming",
                    "MySQL Programming And Administration",
                    "Java Desktop Application Development",
                    "Introduction to HTML and CSS",
                    "Java Data Access",
                    "Java Web Application",
                    "Java Web Services adn XML",
                    "Spring Framework",
                    "Software Engineering",
                    "Blockchain"
            };
            for(int i = 0;i< važnePoruke.length; i++){
                //Odspavam 4 sekunde ili 4000 ms
                try {
                    Thread.sleep(4000);
                    String poruka = važnePoruke[i];
                    threadConsumeMessage(poruka);
                }catch (InterruptedException exception){
                    threadConsumeMessage("Nisam završio a prekinuo si me...");
                }
            }

        }
    }
}
