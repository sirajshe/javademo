import java.lang.Thread;
import org.junit.*;
import static org.junit.Assert.assertEquals;

public class ThreadSafe extends Thread {
	static int myBalance=3000;
	int withdraw, deposit;
	//ThreadSafe(int balance, int deposit, int withdraw) {
	ThreadSafe(int deposit, int withdraw) {
		this.deposit=deposit;
		this.withdraw=withdraw;
		//this.myBalance=balance;
	}
	public void run() {
		if (this.deposit > 0)
		deposit(this.deposit);
		if (this.withdraw > 0)
		withdraw(this.withdraw);
	}

	void deposit(int cash) {
	//synchronized void deposit(int cash) {
		//System.out.println("here ...");
		this.myBalance = this.myBalance + cash;
		//System.out.println("in deposit:"+this.myBalance);
	}
	void withdraw(int cash) {
	//synchronized void withdraw(int cash) {
		this.myBalance = this.myBalance - cash;
	}

	int getBalance() {
		return this.myBalance;
	}

	@Test
	public void testDeposit() {
		ThreadSafe ts = new ThreadSafe(100,0);
		ts.deposit(100);
		assertEquals(3100, myBalance);
	}

	public static void main(String[] s) {
		ThreadSafe transaction = new ThreadSafe(100,0);
		ThreadSafe transaction2 = new ThreadSafe(0,200);
		ThreadSafe transaction3 = new ThreadSafe(500,0);
		System.out.println(transaction.getBalance());	
		transaction.start();
		transaction3.start();
		transaction2.start();
		try {
		transaction.join();
		transaction2.join();
		transaction3.join();
		}catch (Exception allex) {
		}
		System.out.println(myBalance);
	}
}
