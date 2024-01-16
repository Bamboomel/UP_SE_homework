public class Date {
	private int day;
	private int month;
	private int year;
	
	Date(int d, int m, int y) {
		if (d > 31 || d < 1) {
			System.err.println("not a valid input for day");
		} else if (m < 1 || m > 12) {
			System.err.println("not a valid input for month");
		} else if (y < 2) {
			System.err.println("not a valid input for year");
		} else {
			day = d;
			month = m;
			year = y;
		}
	}
	
	Date(Date d) {
		if(d != null) {
			day = d.day;
			month = d.month;
			year = d.year;
		} else {
			System.err.println("not a valid date");
		}
	}
	
	public String showDate() {
		return "" + this.day + "." + this.month + "." + this.year;
	}
}
