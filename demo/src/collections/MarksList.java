package collections;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.TreeMap;

public class MarksList {

	public static void main(String[] args) throws Exception {
		var path = Path.of("c:\\classroom\\jun8\\marks.txt");
	    var lines = Files.readAllLines(path);
	    
		var students = new TreeMap<Integer, Integer>();
		
		for(var line : lines) {
	    	var parts = line.split(",");
			if (parts.length < 2)  // Not enough details 
				continue;
			
			// Process line
			int rollno = Integer.parseInt(parts[0]);
			int marks = Integer.parseInt(parts[1]);
			
			// Do we have this rollno in Map
			if (students.containsKey(rollno)) {
				 var total = students.get(rollno);
				 total += marks;
				 students.put(rollno, total);  // Update existing entry
			}
			else
			     students.put(rollno,marks);   // Add new entry 
		}
	 

		for (var rollno : students.keySet()) {
			System.out.printf("%5d  %5d\n", rollno, students.get(rollno));
		}
	}

}
