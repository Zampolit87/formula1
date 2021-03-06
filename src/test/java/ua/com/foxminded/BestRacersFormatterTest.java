package ua.com.foxminded;

import static java.lang.System.lineSeparator;
import static org.junit.Assert.assertEquals;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class BestRacersFormatterTest {

	private final BestRacersFormatter formatter = new BestRacersFormatter();

	@Test
	void givenOneRacer_whenFormatData_thenReturnOneString() {
		List<Racer> expected = new ArrayList<>();
		expected.add(new Racer("Sebastian Vettel", "FERRARI", Duration.parse("PT1M4.415S")));
		String expectedString = " 1.Sebastian Vettel|FERRARI|1:04.415" + lineSeparator();
		String actualString = formatter.format(expected, 15);
		assertEquals(actualString, expectedString);
	}

	@Test
	void givenManyRacers_whenFormatData_thenReturnManyStrings() {
		List<Racer> expected = new ArrayList<>();
		expected.add(new Racer("Sebastian Vettel", "FERRARI", Duration.parse("PT1M4.415S")));
		expected.add(new Racer("Daniel Ricciardo", "RED BULL RACING TAG HEUER", Duration.parse("PT1M12.013S")));
		expected.add(new Racer("Valtteri Bottas", "MERCEDES", Duration.parse("PT1M12.434S")));

		String expectedString = " 1.Sebastian Vettel|FERRARI                  |1:04.415" + lineSeparator()
				+ " 2.Daniel Ricciardo|RED BULL RACING TAG HEUER|1:12.013" + lineSeparator()
				+ "--------------------------------------------" + lineSeparator()
				+ " 3.Valtteri Bottas |MERCEDES                 |1:12.434" + lineSeparator();

		String actualString = formatter.format(expected, 2);
		assertEquals(actualString, expectedString);
	}
}
