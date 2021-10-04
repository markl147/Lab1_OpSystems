public class SimpleThread extends Thread {
    String name;

    public SimpleThread(String name){
        this.name = name;
    }

    public void run() {
        for (int i = 0; i <10; i++){
            System.out.println("Thread No. : " + i + " " + name);
            try {
                sleep((int)(Math.random() * 1000));
            }
            catch (InterruptedException ignored){
            }
        } System.out.println("Finished all " + name);
    }
}
