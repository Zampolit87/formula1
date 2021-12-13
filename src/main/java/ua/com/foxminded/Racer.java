package ua.com.foxminded;

import java.time.Duration;
import java.util.Objects;

public class Racer {
	
	private String name;
	private String team;
	private Duration bestLap;

	public Racer(String name, String team, Duration bestLap) {
		this.name = name;
		this.team = team;
		this.bestLap = bestLap;
	}

	public String getName() {
		return name;
	}

	public String getTeam() {
		return team;
	}

	public Duration getBestLap() {
		return bestLap;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Racer racer = (Racer) o;
		return Objects.equals(name, racer.name) && Objects.equals(team, racer.team)
				&& Objects.equals(bestLap, racer.bestLap);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, team, bestLap);
	}
}
