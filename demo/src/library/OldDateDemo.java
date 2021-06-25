package library;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class OldDateDemo {

	public static void main(String[] args) {

		var now = Calendar.getInstance();
		// System.out.println(now);
		now.add(Calendar.DAY_OF_MONTH,10);
		System.out.printf("%d-%d\n",
				now.get(Calendar.DAY_OF_MONTH),
				now.get(Calendar.MONTH) + 1);
		
		var ct = new Date();
		System.out.println(ct);
		
		var sdf = new SimpleDateFormat("d-MMM-yyyy HH:mm");
		System.out.println(sdf.format(ct));
		
	}

}
