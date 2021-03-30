package convert;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

/**
 * 
 * @author Ruba
 *
 */
public class TestConverting extends BaseTest{
	
	@Test
	public static void testway1() {
		assertEquals("ruba",UpperToLower.way1());
	}

	@Test
	public static void testway2() {
		assertEquals("rubawael", UpperToLower.way2());
	}
}
