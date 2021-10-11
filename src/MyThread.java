public class MyThread extends Thread {

    private long sleep;

    public MyThread(String name, long sleep) {
        this.sleep = sleep;
        this.setName(name);
    }

    public void run() {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 10; i++) {
            System.out.println(i + " " + getName());
            try {
                sleep(sleep);
            }
            catch (InterruptedException e) {}
        }

        long execTime = System.currentTimeMillis() - startTime;
        System.out.println(getName() + " Thread execution time: " + execTime + " ms");
    }

    public static void main(String[] args) {
        new MyThread("Dog", 1000).start();
        new MyThread("Cat", 500).start();
        new MyThread("Fish", 250).start();
    }
}
