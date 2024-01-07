/** 
 * Prints the calendars of all the years in the 20th century.
 */
public class Calendar1 {	
    // Starting the calendar on 1/1/1900
	static int dayOfMonth = 1;   
	static int month = 1;
	static int year = 1900;
	static int dayOfWeek = 2;     // 1.1.1900 was a Monday
	static int nDaysInMonth = 31; // Number of days in January
	
	/** 
	 * Prints the calendars of all the years in the 20th century. Also prints the  
	 * number of Sundays that occured on the first day of the month during this period.
	 */
	public static void main(String args[]) {
		// Advances the date and the day-of-the-week from 1/1/1900 till 31/12/1999, inclusive.
	    // Prints each date dd/mm/yyyy in a separate line. If the day is a Sunday, prints "Sunday".
	    // The following variable, used for debugging purposes, counts how many days were advanced so far.
	    int firstSunday = 0;
	    int debugDaysCounter = 0; 
	    //// Write the necessary initialization code, and replace the condition
	    //// of the while loop with the necessary condition 
	 	while (year < 2000) {
	 		if (dayOfMonth == 1 && dayOfWeek == 1)
	 			firstSunday++;
	 		advance();
	 		debugDaysCounter++;
	 		//// If you want to stop the loop after n days, replace the condition of the
	 		//// if statement with the condition (debugDaysCounter == n)
	 		if (false) { 
	 			break;
	 		}
   }
	 	System.out.println("During the 20th century, " + firstSunday + " sundays fell on the first day of the month");
     
	 }
	
	 // Advances the date (day, month, year) and the day-of-the-week.
	 // If the month changes, sets the number of days in this month.
	 // Side effects: changes the static variables dayOfMonth, month, year, dayOfWeek, nDaysInMonth.
	 private static void advance() {
	 	if (dayOfMonth < nDaysInMonth)
	 		dayOfMonth++;
	 	else 
	 	{
	 		dayOfMonth = 1;
	 		if (month <12)
	 			month++;
	 		else 
	 		{	
	 			month = 1;
	 			year++;
	 		}
	 		nDaysInMonth = nDaysInMonth(month, year);
	 	}
	 	if (dayOfWeek<7) 
	 		dayOfWeek++;
	 	else 
	 		dayOfWeek = 1;
	 	if (year<2000)
	 	{ 
	 		System.out.print(dayOfMonth + "/" + month + "/" + year);
	 		if (dayOfWeek == 1)
	 			System.out.print(" Sunday");
			System.out.println();
		}	
	  } 
		 
    // Returns true if the given year is a leap year, false otherwise.
	private static boolean isLeapYear(int year) {
		boolean isLeapYear = false;
		isLeapYear = ((year % 400) == 0);
		isLeapYear = isLeapYear || (((year % 4) == 0) && ((year % 100) != 0));
		return isLeapYear;
	}
	 
	// Returns the number of days in the given month and year.
	// April, June, September, and November have 30 days each.
	// February has 28 days in a common year, and 29 days in a leap year.
	// All the other months have 31 days.
	private static int nDaysInMonth(int month, int year) {
int nDaysInMonth = 0;
		switch (month) {
		case 1: nDaysInMonth = 31;
				break;
		case 2: if (isLeapYear(year))
					nDaysInMonth = 29;
				else 	
					nDaysInMonth = 28;
				break;
		case 3: nDaysInMonth = 31;
				break;
		case 4: nDaysInMonth = 30;
				break;
		case 5: nDaysInMonth = 31;
				break;
		case 6: nDaysInMonth = 30;
				break;
		case 7: nDaysInMonth = 31;
				break;
		case 8: nDaysInMonth = 31;
				break;
		case 9: nDaysInMonth = 30;
				break;
		case 10: nDaysInMonth = 31;
				break;
		case 11: nDaysInMonth = 30;
				break;
		case 12: nDaysInMonth = 31;
				break;
		}
		return nDaysInMonth;
	}
}
