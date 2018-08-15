package be.businesstraining;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import be.businesstraining.metier.Calcul;

public class CalculTest {

	private Calcul underTest;

	@Before
	public void setUp() {
		underTest = new Calcul();
	}

	@After
	public void tearDown() {
		underTest = null;
	}

	@Test
	public final void testAdditionner() {

		// ARRANGE
		int a = 11;
		int b = 22;
//		Calcul underTest = new Calcul();
		int expected = 33;

		// ACT
		int actual = underTest.additionner(a, b);

		// ASSERT
		assertEquals(expected, actual);

	}

	@Test
	public final void testDiviser_Nominal() {

		// ARRANGE
		int a = 25;
		int b = 2;
		int expected = 12;
		// Calcul underTest = new Calcul();

		// ACT
		int actual = underTest.diviser(a, b);

		// ASSERT
		assertEquals(expected, actual);

	}
	@Test(expected=ArithmeticException.class)
	public final void testDiviser_Degrade() {

		// ARRANGE
		int a = 25;
		int b = 0;
		

		// ACT
		int actual = underTest.diviser(a, b);

		

	}

}
