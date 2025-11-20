public class UsingRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread is Running...");
    }

    public static void main(String[] args) {
        UsingRunnable thread2=new UsingRunnable();
        thread2.run();
    }
}
