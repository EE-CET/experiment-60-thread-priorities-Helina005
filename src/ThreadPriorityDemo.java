











class PriorityThread extends Thread {
    public PriorityThread(String name) {
        super(name);
    }

    public void run() {
        System.out.println(getName() + " Priority: " + getPriority());
    }
}

public class ThreadPriorityDemo { 
    public static void main(String[] args) {
        PriorityThread t1 = new PriorityThread("Thread 1");
        PriorityThread t2 = new PriorityThread("Thread 2");
        PriorityThread t3 = new PriorityThread("Thread 3");

        t1.setPriority(Thread.MIN_PRIORITY);  // 1
        t2.setPriority(Thread.NORM_PRIORITY); // 5
        t3.setPriority(Thread.MAX_PRIORITY);  // 10

        // Start and Join each thread one by one to force the specific output order
        try {
            t1.start();
            t1.join(); 
            
            t2.start();
            t2.join();
            
            t3.start();
            t3.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}