import java.util.concurrent.atomic.AtomicInteger;

class Counter {
    // First Method To Atomic[DATA type] count = new Atomic[DATA type]();

   AtomicInteger count = new AtomicInteger();

    public void increment() {
    // Using the count.incrementAndGet();
        count.incrementAndGet();
    }
    // // Second method to thread safe Woring is used synchronized keyword in method 
    // public synchronized void increment() {
    //     count++;
    // }
}

public class ThreadSafe {
    public static void main(String[] args) throws  Exception {
        Counter obj = new Counter();
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    obj.increment(); 
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    obj.increment();
                }
            }
        });
t1.start();
t2.start();
t1.join();
t2.join();
        System.out.println("The Count = " + obj.count);
    }
}
