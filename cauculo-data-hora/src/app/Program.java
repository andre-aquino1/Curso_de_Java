package app;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Program {

	public static void main(String[] args) {

		LocalDate d01 = LocalDate.parse("2025-06-16");
		LocalDateTime d02 = LocalDateTime.parse("2025-06-16T01:30:26");
		Instant d03 = Instant.parse("2025-06-16T01:30:26z");

		LocalDate pastWeelLocalDate = d01.minusDays(7);
		LocalDate nextWeekLocalDate = d01.plusDays(7);

		System.out.println();
		System.out.println("d01 = " + d01);
		System.out.println("pastWeelLocalDate = " + pastWeelLocalDate);
		System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);

		LocalDateTime pastWeelLocalDateTime = d02.minusDays(7);
		LocalDateTime nextWeekLocalDateTime = d02.plusDays(7);

		System.out.println();
		System.out.println("d02 = " + d02);
		System.out.println("pastWeelLocalDateTime = " + pastWeelLocalDateTime);
		System.out.println("nextWeekLocalDateTime = " + nextWeekLocalDateTime);

		System.out.println();
		Instant pastWeekIntant = d03.minus(7, ChronoUnit.DAYS);
		Instant nextWeekIstant = d03.plus(7, ChronoUnit.DAYS);

		System.out.println("d03 = " + d03);
		System.out.println("pastWeekIntant = " + pastWeekIntant);
		System.out.println("nextWeekIstant = " + nextWeekIstant);

		Duration t1 = Duration.between(pastWeelLocalDateTime, d02);

		System.out.println();
		System.out.println("t1 dias =  " + t1.toDays());
		System.out.println("t1 horas = " + t1.toHours());

	}

}
