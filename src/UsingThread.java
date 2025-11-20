public class UsingThread extends Thread{
    public void run(){
        System.out.println("Main thread");
    }

    public static void main(String[] args) {
        UsingThread thread1 = new UsingThread();
        thread1.start();
    }
}
