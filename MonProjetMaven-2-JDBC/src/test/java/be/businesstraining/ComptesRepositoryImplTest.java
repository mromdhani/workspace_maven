package be.businesstraining;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import be.businesstraining.repository.ComptesRepositoryImpl;
import be.businesstraining.repository.IComptesRepository;

public class ComptesRepositoryImplTest {

	private IComptesRepository underTest;
	
	@Before
	public void setUp()  {
		underTest = new ComptesRepositoryImpl();
	}

	@After
	public void tearDown()  {
		underTest = null;
	}

	@Test
	public final void testFindAll() {
		// ARRANGE
		int expected = 4;
	
		//ACT
		int actual = underTest.findAll().size();
		
		// ASSERT
		assertEquals(expected, actual);
	}

}
