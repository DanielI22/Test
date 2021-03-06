package Parallel;

public class MySemaphore {
    private int permits;

    /** permits is the initial number of permits available.
     This value can be negative, in which case releases must occur
     before any acquires will be granted, permits is number of threads
     that can access shared resource at a time.
     If permits is 1, then only one threads that can access shared
     resource at a time.
     */
    public MySemaphore(int permits) {
        this.permits=permits;
    }

    /**Acquires a permit if one is available and decrements the
     number of available permits by 1.
     If no permit is available then the current thread waits
     until one of the following things happen >
     >some other thread calls release() method on this semaphore or,
     >some other thread interrupts the current thread.
     */
    public synchronized void acquire() throws InterruptedException {
        //Acquires a permit, if permits is greater than 0 decrements
        //the number of available permits by 1.
        if (permits <= 0) {
            this.wait();
        }
        permits--;
    }

    /** Releases a permit and increases the number of available permits by 1.
     For releasing lock by calling release() method it’s not mandatory
     that thread must have acquired permit by calling acquire() method.
     */
    public synchronized void release() {
        //increases the number of available permits by 1.
        permits++;

        //If permits are greater than 0, notify waiting threads.
        if(permits > 0)
            this.notify();
    }
}
