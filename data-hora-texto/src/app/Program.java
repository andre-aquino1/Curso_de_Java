package app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {

		LocalDate d01 = LocalDate.parse("2025-06-11");
		LocalDateTime d02 = LocalDateTime.parse("2025-06-11T15:07:20");
		Instant d03 = Instant.parse("2025-06-11T15:07:40z");

		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

		System.out.println("d01 = " + d01.format(fmt1));
		System.out.println("d02 = " + fmt2.format(d02));
		System.out.println("d03 = " + fmt3.format(d03));
	}

}
