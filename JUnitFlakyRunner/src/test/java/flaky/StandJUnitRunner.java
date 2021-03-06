package flaky;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StandJUnitRunner {
	
	RandomNormal randomNormal;
	
	@Before
	public void setup() {
		randomNormal = new RandomNormal();
	}
	
	@Test
	public void testPerfect() {
		assertTrue(randomNormal.getRandom(1));
	}
	
	@Test
	public void testMostlyPass() {
		assertTrue(randomNormal.getRandom(.9));
	}
	
	@Test
	public void testMostlyFail() {
		assertTrue(randomNormal.getRandom(.10));
	}
	
	@Test
	public void testAllFails() {
		assertTrue(false);
	}
	
}
