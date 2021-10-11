public class SimpleThreadRunnableTester {

    public static void main(String[] args) {

        Runnable run1 =  new SimpleThreadRunnable("Dog");
        Thread t1 = new Thread(run1) ;
        Runnable run2 =  new SimpleThreadRunnable("Cat");
        Thread t2 = new Thread(run2) ;
        Runnable run3 =  new SimpleThreadRunnable("Fish");
        Thread t3 = new Thread(run3) ;

        t1.start();
        t2.start();
        t3.start();
    }
}
