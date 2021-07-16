package advanced;

import java.nio.file.Files;
import java.nio.file.Path;

public class ListJavaPrograms {

	public static void main(String[] args) throws Exception {
		Path startdir = Path.of("c:\\classroom\\jun8");

		Files.walk(startdir)
		     .filter(p -> p.toString().endsWith(".java"))
		     .forEach(System.out::println);
	}

}
