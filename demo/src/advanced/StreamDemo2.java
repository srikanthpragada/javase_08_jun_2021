package advanced;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.regex.Pattern;

public class StreamDemo2 {

	public static void main(String[] args) throws Exception {
		 
		var path = Path.of("c:\\classroom\\names.txt");
		var stream = Files.lines(path);
		
		stream.filter(n ->  Pattern.matches("[a-zA-Z ]+",n))
		     .map(s -> s.toUpperCase())
		     .distinct()
		     .sorted()
		     .forEach(System.out::println);
		
		
		// stream.sorted().forEach(System.out::println);
    
	}

}
