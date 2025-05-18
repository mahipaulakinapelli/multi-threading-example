public class Main {
    public static void main(String[] args) {
        // Create a new thread using the Runnable interface.
        RunnableExample runnableExample = new RunnableExample();
        Thread thread1 = new Thread(runnableExample);
        Thread thread2 = new Thread(runnableExample);

        thread1.start();
        thread2.start();

        // The main thread continues to execute concurrently with the new thread.
        for(int i=0;i<100;i++){
            System.out.println("Main thread is running: " + i);
        }

        System.out.println("Main thread finished.");

        // Create a new thread using the Thread class.
        ThreadExample threadExample = new ThreadExample();
        threadExample.start();
    }
}