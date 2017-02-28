package exempleRentruntLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Created by Artem on 30.01.2017.
 */
public class Locks<T> {
    private final Lock lock = new ReentrantLock();
    private final ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    private Object[] items;

    public static void main(String[] args) throws InterruptedException {
        final Locks locks = new Locks();
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                public void run() {
                    try {
                        locks.test();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();

        }
    }

    public void test() throws InterruptedException {
        String thread = Thread.currentThread().getName();
        System.out.println(thread + "tries lock");
        lock.lock();
        Thread.sleep(1000);
        System.out.println(thread + "releasing lock");
        lock.unlock();
    }
}
