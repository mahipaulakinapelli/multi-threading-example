public class ThreadExample extends Thread {
    public void run() {
        System.out.println("Thread Example: Thread started.");
        for (int i = 0; i < 100; i++) {
            System.out.println("Thread Example: Thread is running: " + i);
        }
        System.out.println("Thread Example: Thread finished.");
    }
}
