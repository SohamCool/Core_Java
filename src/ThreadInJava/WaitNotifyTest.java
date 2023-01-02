package ThreadInJava;

public class WaitNotifyTest {
    private static final long SLEEP_INTERVAL = 3000;
    private boolean running = true;
    private Thread thread;
    public void start(){
        System.out.println("Inside start() method");
        thread = new Thread(new Runnable(){
            @Override
            public void run(){
                System.out.println("Inside run() method");
                try{
                    Thread.sleep(SLEEP_INTERVAL);
                }catch (InterruptedException e){
                    Thread.currentThread().interrupt();
                }
                synchronized (WaitNotifyTest.this){
                    running = false;
                    WaitNotifyTest.this.notify();
                }
            }
        });
        thread.start();
    }

    public void join() throws InterruptedException{
        System.out.println("Inside join() method");
        synchronized (this){
            while(running){
                System.out.println("Waiting for the peer thread to finish.");
                wait();
            }
            System.out.println("Peer thread finished.");
        }
    }

    public static void main(String[] args) throws InterruptedException{
        WaitNotifyTest test = new WaitNotifyTest();
        test.start();
        test.join();
    }
}
