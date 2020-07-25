package lesson3.Counter;
import java.util.concurrent.locks.Lock;

public class Incrementor implements Runnable{
    Count count;
    Thread t;
    Lock lock;
    String name;

    public Incrementor(Count count, Lock lock, String name) {
        this.count = count;
        this.lock = lock;
        this.name = name;
        this.t = new Thread(this, name);
        t.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            if(Thread.interrupted()) break;
            lock.lock();
            count.increment();
            System.out.println(name + ": " + count.getSum());
            try {
                Thread.sleep(200);
            } catch (InterruptedException ex) {
                System.out.println("Исключение прерывания потока " + name);
                lock.unlock();
                break;
            }
            lock.unlock();
        }
    }
}
