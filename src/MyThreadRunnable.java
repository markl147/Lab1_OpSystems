public class MyThreadRunnable implements Runnable {

    private String name;
    private long sleep;

    public MyThreadRunnable(String name, long sleep) {
        this.name = name;
        this.sleep = sleep;
    }

    @Override
    public void run() {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " " + name);

            try {
                Thread.sleep(sleep);
            }
            catch (InterruptedException e) { }
        }

        long execTime = System.currentTimeMillis() - startTime;
        System.out.println("Finished: " + name + " thread execution time: " + execTime + " ms");
    }

    public static void main(String[] args) {
        Runnable run1 = new MyThreadRunnable("Dog", 1000);
        Runnable run2 = new MyThreadRunnable("Cat", 500);
        Runnable run3 = new MyThreadRunnable("Fish", 250);

        Thread t1 = new Thread(run1);
        Thread t2 = new Thread(run2);
        Thread t3 = new Thread(run3);

        t1.start();
        t2.start();
        t3.start();
    }
}
