package collections;

import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) {
		var p = new Properties();
		p.setProperty("name", "Srikanth");
		p.setProperty("email","srikanth@gmail.com");

		for (var k : p.stringPropertyNames()) {
			System.out.printf("%s  - %s\n", k, p.getProperty(k));
		}

	}
}
