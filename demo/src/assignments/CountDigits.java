package assignments;

public class CountDigits {

	public static void main(String[] args) {
		String st = "Abc123xyz45";
		int count = 0;

		for (int i = 0; i < st.length(); i++) {
			char ch = st.charAt(i);
			
			// if (ch >= 48 && ch <= 57)
			if (Character.isDigit(ch))
				count++;
		}
		
		System.out.println(count);

	}

}
