/*
 * PagarmeCoreApiLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package me.pagar.api.controllers.syncwrapper;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * Base class to help convert an asynchronous callback to synchronous one
 */
public class SynchronousBase {
    
    private CountDownLatch lock;
    
    /**
     * Initiate class with a task count
     * @param count Number of tasks we will wait on
     */
    public SynchronousBase(int count) {
        this.lock = new CountDownLatch(count);
    }
    
    /**
     * Initiate class with a count down of one only
     */
    public SynchronousBase() {
        this(1);
    }

    /**
     * Mark as done one task
     */
    protected void markAsDone()
    {
        lock.countDown();
    }
    
    /**
     * Wait until all tasks are marked as done
     * @throws InterruptedException
     */
    public void await() throws InterruptedException {
        lock.await();
    }
    
    /**
     * Wait until all tasks are marked as done or timeout after given time
     * @param timeout Time to wait
     * @param unit    Unit for time
     * @return
     * @throws InterruptedException
     */
    public boolean await(long timeout, TimeUnit unit) throws InterruptedException {
        boolean t = lock.await(timeout, unit);
        return t;
    }
    
}

