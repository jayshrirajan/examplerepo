package example.com;

import java.util.Calendar;

public class togetcurrentdateandtym {
	public static void main(String[] args) 
	{
		// creating object of calendar.
		Calendar now = Calendar.getInstance();

		// print the current date.
		System.out.println("Current date : " + (now.get(Calendar.MONTH) + 1) 
		+ "-"+ now.get(Calendar.DATE) + "-" + now.get(Calendar.YEAR));

		//adding number of days 
		now.add(Calendar.DATE, 10);

		// print date after changement.
		System.out.println("Changed date : " + (now.get(Calendar.MONTH) + 1) 
		+ "-"+ now.get(Calendar.DATE) + "-" + now.get(Calendar.YEAR));
	}


}
