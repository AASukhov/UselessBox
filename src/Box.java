public class Box implements Runnable{
    public static int BOX_PAUSE = 1500;

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            if (Main.trigger) {
                Main.trigger = false;
                System.out.println("Коробка нажала на тумблер");
                try {
                    Thread.sleep(BOX_PAUSE);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
