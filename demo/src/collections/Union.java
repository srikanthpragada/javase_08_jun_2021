package collections;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedHashSet;

public class Union {

	public static void main(String[] args) throws Exception {
   
		var file1 = Path.of("c:\\classroom\\names1.txt");
		var file2 = Path.of("c:\\classroom\\names11.txt");
		
		var firstLines = Files.readAllLines(file1);
		var secondLines = Files.readAllLines(file2);
		
		var lines = new LinkedHashSet<String>(firstLines);
		lines.addAll(secondLines);
		
		for(var l : lines)
			System.out.println(l);
		
		
	}

}
