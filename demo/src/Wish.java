public class Wish {

	public static void main(String[] args) {
		 String name;
		 
		 if(args.length == 0) 
			 name = "Guest";
		 else
			 name = args[0];
		 
		 System.out.printf("Hello %s", name);
		 
	}

}
