public class SimpleThreadRunnable implements Runnable {
    String name;
    int snooze;


    public SimpleThreadRunnable(String name, int snooze) {
        this.name = name ;
        this.snooze = snooze ;
    }


    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            System.out.println("Thread No.: " +i + " " + name);
            try {
//                sleepTime = (int)(Math.random() * 1000);
                Thread.sleep(snooze);
            } catch (InterruptedException e) {}
        }
        System.out.println("Finished all : " + name);
    }
}
