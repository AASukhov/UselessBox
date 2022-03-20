public class Main {

    public static volatile boolean trigger;

    public static void main(String[] args) {
        User user = new User();
        Box box = new Box();

        Thread userThread = new Thread(user);
        Thread boxThread = new Thread(box);
        userThread.start();
        boxThread.start();

        try {
            userThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        boxThread.interrupt();
    }
}
