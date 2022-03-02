package six.thread;

public class DeadLock {


    public static void main(String[] args) {
        Friend dino = new Friend("Dino");
        Friend nedim = new Friend("Nedim");
        new Thread(()->dino.naklon(nedim)).start();
        new Thread(()->nedim.naklon(dino)).start();
    }

    static class Friend {
        private String name;

        public Friend(String name){
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public synchronized void naklon(Friend friend){
            System.out.format("%s: %s se meni naklonio%n", this.name, friend.getName());
            friend.uzvratiNaklon(this);
        }
        public synchronized void uzvratiNaklon(Friend friend){
            System.out.format("%s: %s je meni uzvratio naklon%n", this.name, friend.getName());
        }
    }
}
