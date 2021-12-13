package ua.com.foxminded;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Parser {
	
	private static final String UNDERSCORE = "_";
	private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd_HH:mm:ss.SSS");

	public List<Racer> parseData(List<String> abbreviationsLogs, List<String> startRaceLogs, List<String> endRaceLogs) {
		if (abbreviationsLogs == null) {
			throw new IllegalArgumentException("abbreviations cannot be null.");
		}
		if (startRaceLogs == null) {
			throw new IllegalArgumentException("startRace cannot be null.");
		}
		if (endRaceLogs == null) {
			throw new IllegalArgumentException("endRace cannot be null.");
		}
		Map<String, LocalDateTime> startRaceLogInfo = splitTime(startRaceLogs);
		Map<String, LocalDateTime> endRaceLogInfo = splitTime(endRaceLogs);
		return abbreviationsLogs.stream()
				.map(a -> a.split(UNDERSCORE))
				.map(a -> new Racer(a[1], a[2], Duration.between(startRaceLogInfo.get(a[0]), endRaceLogInfo.get(a[0]))))
				.collect(Collectors.toList());
	}

	private Map<String, LocalDateTime> splitTime(List<String> timeLogs) {
		return timeLogs.stream()
				.collect(Collectors.toMap(t -> t.substring(0, 3), t -> LocalDateTime.parse(t.substring(3), FORMATTER)));
	}
}
