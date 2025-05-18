// Create a thread using runnable interface

// Step-1: Create a class that implements the Runnable interface
// Step-2: Override the run() method to define the code that should be executed by the thread.
// Step-3: Create an instance of the Thread class, passing the Runnable object to its constructor.
// Step-4: Start the thread using the start() method.
// Step-5: The run() method will be executed in a separate thread when start() is called.
// Step-6: The main thread continues to execute concurrently with the new thread.
// Step-7: Start method invokes the run method in a new thread.

public class RunnableExample implements Runnable {
    @Override
    public void run() {
        System.out.println("Runnable Example: Thread started.");
        for(int i=0;i<10;i++){
            System.out.println("Runnable Example: Thread is running: " + i);
        }
        System.out.println("Runnable Example: Thread finished.");
    }
}
