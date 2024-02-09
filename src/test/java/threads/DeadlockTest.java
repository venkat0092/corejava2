package threads;



import org.junit.jupiter.api.Test;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import static org.junit.jupiter.api.Assertions.assertThrows;

class DeadlockTest {

    @Test
    void testDeadlockOccurs() {
        Lock lock1 = new ReentrantLock();
        Lock lock2 = new ReentrantLock();

        // Create two threads with different lock acquisition order
        Thread thread1 = new Thread(new Deadlock.Worker(lock1, lock2));
        Thread thread2 = new Thread(new Deadlock.Worker(lock2, lock1));

        // Start the threads
        thread1.start();
        thread2.start();

        // Verify that a deadlock occurs
        assertThrows(IllegalMonitorStateException.class, () -> {
            // Wait for threads to finish (which they won't due to deadlock)
            thread1.join();
            thread2.join();
        });
    }
}
