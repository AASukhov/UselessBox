public class User implements Runnable {

    private static final int COUNT = 5;
    public static final int USER_PAUSE = 3000;

    @Override
    public void run () {
        for (int i = 0; i < COUNT; i++) {
            if (!Main.trigger) {
                Main.trigger = true;
                System.out.println("Пользователь нажал на тумблер");
                try {
                    Thread.sleep(USER_PAUSE);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
