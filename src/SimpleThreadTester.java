public class SimpleThreadTester extends Thread {
    public static void main(String[] args) {

        Thread dog = new SimpleThread("Dog");
        Thread cat = new SimpleThread("Cat");
        Thread fish = new SimpleThread("Fish");

        dog.start();
        cat.start();
        fish.start();
    }
}
