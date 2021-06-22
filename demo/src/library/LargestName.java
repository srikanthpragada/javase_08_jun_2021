package library;

public class LargestName {

	public static void main(String[] args) {

		String data = "Java,Python,C#,JavaScript,Ruby";

		String names[] = data.split(",");
		int pos = 0;

		for (int i = 0; i < names.length; i++) {
			if (names[i].length() > names[pos].length())
				pos = i;
		}
		
		System.out.println(names[pos]);
		
        String largest = names[0];
        
		for(String name : names)
		{
			if (name.length() > largest.length())
				  largest = name;
		}
		
		System.out.println(largest);

	}

}
