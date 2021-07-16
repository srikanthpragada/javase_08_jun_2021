package advanced;

import java.nio.file.Files;
import java.nio.file.Path;

public class SearchJavaPrograms {

	public static boolean fileContainsPattern(Path file, String pattern) {
		if (!file.toString().endsWith(".java"))
			return false;
		
		try {
			return Files.readString(file).contains(pattern);
		} catch (Exception ex) {
			return false;
		}
	}

	public static void main(String[] args) throws Exception {
		Path startdir = Path.of("c:\\classroom\\jun8");
		String pattern = "LocalDate";

		Files.walk(startdir)
		    .filter(p -> fileContainsPattern(p,pattern))
		    .forEach(System.out::println);
	}

}
