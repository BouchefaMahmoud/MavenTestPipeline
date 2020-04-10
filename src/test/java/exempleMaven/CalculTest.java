package exempleMaven;

import org.junit.Test;

import junit.framework.Assert;

public class CalculTest {


	@Test
	public void given_0_expect_0() {
		Assert.assertEquals(0, new Calcul().times(0, 0),0.00);
	}
	
	@Test
	public void test() {
		Assert.assertTrue(false);
	}
}
