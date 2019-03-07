public class Thread1 implements Runnable
{
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println("Running the thread..."+ t.getName());
		try {
			Thread.sleep(1);
		} catch(Exception e) {
		}
	}

	public static void main(String[] s) throws Exception {
		(new Thread (new Thread1())).start();
		Thread t1 = new Thread(new Thread1());
		Thread t2 = new Thread(new Thread1());
		t1.setName("Thread 100");
		t2.setName("Thread 200");
		t1.start();
		t2.start();
	}
}
