package oop;

public class AssertDemo {

	public static boolean hasUpper(String s) {
		for (int i = 0; i < s.length(); i++)
			if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
				return true;
		
        return false; 
	}

	public static boolean isEven(int n) {
		return  n % 2 == 0;
	}
	public static void main(String[] args) {
 		//Test hasUpper
		assert  hasUpper("abc") == false : "Invalid result from hasUpper()";
		assert  hasUpper("Abc") == true  : "Invalid result from hasUpper()";
		assert  isEven(10) == true :  "Incorrect result from isEven()";
	}

}
