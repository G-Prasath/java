class Counter{
    private int count;

    public synchronized void inc(){
        count++;
    }

    public int getCount(){
        return count;
    }
}

public class MultiThread {
    public static void main(String[] args) {
       Counter counter = new Counter();

       Runnable task = () -> {
        for (int i = 0; i < 10000; i++) {
            counter.inc();
        }
       };
       

       Thread t1 = new Thread(task);
       Thread t2 = new Thread(task);

       t1.start();
       t2.start();

       try {
        t1.join();
        t2.join();
       }
       catch (InterruptedException e) {
        e.printStackTrace();
       }

       System.out.println("Final Output : " + counter.getCount());
    }
}
