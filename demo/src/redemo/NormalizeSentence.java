package redemo;

public class NormalizeSentence {

	public static void main(String[] args) {
		var st = "How do    you do?. Hope    you are fine!!!!";
		
		for(var w : st.split("\\W+"))
			  System.out.printf("%s  %d\n",w, w.length());
		
		
		

	}

}
