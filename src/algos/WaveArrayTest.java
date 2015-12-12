package algos;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class WaveArrayTest {
	
	WaveArray wa;

	@Before
	public void setUp() throws Exception {
		wa = new WaveArray();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testEvenNumberElements() {
		int[] inputArray = {1,2,3,4,5,6};
		int[] expectedArray = {4,1,5,2,6,3};
		assertArrayEquals(expectedArray, wa.waveSort(inputArray));
	}

	@Test
	public void testOddElements() {
		int[] inputArray = {1,2,3,4,5,6,7};
		int[] expectedArray = {4,1,5,2,6,3,7};
		assertArrayEquals(expectedArray, wa.waveSort(inputArray));
	}
	@Test
	public void testDuplicates() {
		int[] inputArray = {0, 1, 2, 3, 3, 3, 3, 3, 8, 9};
		int[] expectedArray = {3, 0, 3, 1, 3, 2, 8, 3, 9, 3};
		assertArrayEquals(expectedArray, wa.waveSort(inputArray));
	}
	/*@Test
	public void test() {
		int[] inputArray = {1,2,3,4,5,6};
		int[] expectedArray = {4,1,5,2,6,3};
		assertArrayEquals(expectedArray, wa.waveSort(inputArray));
	}*/
}
