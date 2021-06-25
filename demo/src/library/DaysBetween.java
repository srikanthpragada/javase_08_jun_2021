package library;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DaysBetween {

	public static void main(String[] args) {
		String start =  "05-02-2021";
		
		var startDate = LocalDate.parse(start, 
				DateTimeFormatter.ofPattern("dd-MM-uuuu"));
		
		var today = LocalDate.now();
		var days = ChronoUnit.DAYS.between(startDate,today);
		System.out.println(days);
		
		
		
	}

}
