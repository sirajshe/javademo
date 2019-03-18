import org.junit.*;
import static org.junit.Assert.assertEquals;
public class TestThreadSafe {

	@Test
        public void testDeposit() {
                ThreadSafe ts = new ThreadSafe(100,0);
		ts.myBalance=3000;
                ts.deposit(100);
                assertEquals(3100, ts.myBalance);
        }
	@Test
        public void testWithdraw() {
                ThreadSafe ts = new ThreadSafe(100,0);
		ts.myBalance=3000;
                ts.withdraw(700);
                assertEquals(2300, ts.myBalance);
		
	}
}
