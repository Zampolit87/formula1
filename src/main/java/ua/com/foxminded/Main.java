package ua.com.foxminded;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		Reader reader = new Reader();
		Parser parser = new Parser();
		BestRacersFormatter bestRacersFormatter = new BestRacersFormatter();

		List<String> abbreviations = reader.read("abbreviations.txt");
		List<String> starts = reader.read("start.log");
		List<String> ends = reader.read("end.log");
		List<Racer> racers = parser.parseData(abbreviations, starts, ends);

		System.out.print(bestRacersFormatter.format(racers, 15));
	}
}
