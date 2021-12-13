package ua.com.foxminded;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class ReaderTest {

	private final Reader reader = new Reader();

	@Test
	void givenFileName_whenRead_thenContentStrings() {
		List<String> actual = reader.read("abbreviations_test.txt");
		List<String> expected = new ArrayList<>();
		expected.add("DRR_Daniel Ricciardo_RED BULL RACING TAG HEUER");
		expected.add("SVF_Sebastian Vettel_FERRARI");
		expected.add("LHM_Lewis Hamilton_MERCEDES");
		assertEquals(actual, expected);
	
	}

	@Test
	void givenNull_whenRead_thenThrowException() {
		assertThrows(NullPointerException.class, () -> reader.read(null));
	}
}