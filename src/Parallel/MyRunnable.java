package Parallel;

public class MyRunnable implements Runnable{
    MySemaphore mySemaphore;

    public MyRunnable(MySemaphore mySemaphore) {
        this.mySemaphore = mySemaphore;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+
                " is waiting for permit");
        try {
            mySemaphore.acquire();
            System.out.println(Thread.currentThread().getName()+
                    " has got permit");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
