package TestApi;

import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTimeUtils {

	public static void main(String[] args) {
		
		Date now = new Date();
		System.out.println("The time is " + now);
		
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
	    String strDate = df.format(now);
	    System.out.println("The time is " + strDate);
	    
	    df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	    strDate = df.format(now);
	    System.out.println("The time is " + strDate);
	    
	    df = new SimpleDateFormat("yy/M/d hh:mm:ss.SSS");
	    strDate = df.format(now);
	    System.out.println("The time is " + strDate);
	    
	    df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	    try {
			Date date = df.parse("2019/01/30 15:13:26");
			System.out.println("The date is " + date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    // Try parse a date not exits
	    try {
	    	df.setLenient(false);
			Date date = df.parse("2019/02/29 15:13:26");
			System.out.println("The date is " + date);
		} catch (ParseException e) {
			System.out.println("The date you input does no exist!");
		}
	    
	    // Calculate date on Calendar
	    Calendar cal = Calendar.getInstance();
	    cal.setTime(now);
	    cal.add(Calendar.DATE, 10);
	    Date after10days = cal.getTime();
	    String str10days = df.format(after10days);
	    System.out.println("The str10days is " + str10days);
	}

}
