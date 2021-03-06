package ua.com.foxminded;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

public class ParserTest {

	Parser parser = new Parser();
	List<String> abbreviations = Arrays.asList("DRR_Daniel Ricciardo_RED BULL RACING TAG HEUER",
			"SVF_Sebastian Vettel_FERRARI",
			"LHM_Lewis Hamilton_MERCEDES");
	List<String> starts = Arrays.asList("SVF2018-05-24_12:02:58.917",
			"DRR2018-05-24_12:14:12.054",
			"LHM2018-05-24_12:18:20.125");
	List<String> ends = Arrays.asList("DRR2018-05-24_12:15:24.067",
			"SVF2018-05-24_12:04:03.332",
			"LHM2018-05-24_12:19:32.585");

	@Test
	void givenLists_whenGetRacers_thenListOfRacers() {
		List<Racer> actual = parser.parseData(abbreviations, starts, ends);
		List<Racer> expected = new ArrayList<>();
		expected.add(new Racer("Daniel Ricciardo", "RED BULL RACING TAG HEUER", Duration.parse("PT1M12.013S")));
		expected.add(new Racer("Sebastian Vettel", "FERRARI", Duration.parse("PT1M4.415S")));
		expected.add(new Racer("Lewis Hamilton", "MERCEDES", Duration.parse("PT1M12.460S")));

		assertEquals(expected, actual);
	}

	@Test
	void givenNullAbbervations_whenGetRacers_thenIllegalArgumentException() {
		assertThrows(IllegalArgumentException.class, () -> parser.parseData(null, starts, ends));
	}

	@Test
	void givenNullStarts_whenGetRacers_thenIllegalArgumentException() {
		assertThrows(IllegalArgumentException.class, () -> parser.parseData(abbreviations, null, ends));
	}

	@Test
	void givenNullEnds_whenGetRacers_thenIllegalArgumentException() {
		assertThrows(IllegalArgumentException.class, () -> parser.parseData(abbreviations, starts, null));
	}

	@Test
	void givenThreeNulls_whenGetRacers_thenIllegalArgumentException() {
		assertThrows(IllegalArgumentException.class, () -> parser.parseData(null, null, null));
	}
}
