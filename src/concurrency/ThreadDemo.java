package concurrency;

class MyRunnable implements Runnable {
    public void run() {
        System.out.println("MyRunnable running");
    }
}

class MyThread extends Thread {
    public void run() {
        System.out.println("MyThread running");
    }
}

public class ThreadDemo {

    public static void main(String[] argvs) {
        Thread myRunnable = new Thread(new MyRunnable());
        myRunnable.start();

        Thread myThread = new MyThread();
        myThread.start();
    }
}
