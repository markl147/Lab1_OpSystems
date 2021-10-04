public class SimpleThreadTester extends Thread {
    public static void main(String[] args) {

        Thread t1 =  new SimpleThread("Dog");
        Thread t2 =  new SimpleThread("Cat");
        Thread t3 =  new SimpleThread("Fish");

        t1.start();
        t2.start();
        t3.start();
    }
}
