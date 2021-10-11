import java.util.Random;

public class SimpleThreadRunnable implements Runnable {

    String name;

    public SimpleThreadRunnable(String name) {
        this.name = name;
    }


//    @Override
//    public void run() {
//
//        for (int i = 0; i < 10; i++) {
//            System.out.println("Thread No.: " +i + " " + name);
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {}
//        }
//        System.out.println("Finished all: " + name);
//    }

    @Override
    public void run() {
        Random random = new Random();
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 10; i++) {
            System.out.println("Thread No.: " +i + " " + name);
            try {
                int time = random.nextInt(1000);
                Thread.sleep(time);
            } catch (InterruptedException e) {}
        }
        long execTime = System.currentTimeMillis() - startTime;
        System.out.println("Finished all: " + name + " Thread execution time: " + execTime + " ms");
    }
}
