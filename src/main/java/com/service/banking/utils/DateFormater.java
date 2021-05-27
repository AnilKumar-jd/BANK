package com.service.banking.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.text.ParseException;

public class DateFormater {

	public DateFormater() {
		super();
	}

	DateFormat format = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
	Calendar calendar = new GregorianCalendar();
	Date date1 = null;
	String endDate = "";
	String startDate = "";
    Date dateformat=null;  // for format date.................
   
	public Date getFromatDate(String date) {
		try {
			dateformat = format.parse(date);
		}
		catch (ParseException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		}
		return dateformat;
	}
	
	public Map<String, Integer> getMotnYearDay(String date) {
		Map<String, Integer> datemap = new HashMap<String, Integer>();
		try {
			date1 = format.parse(date);
			calendar.setTime(date1);
			int year = calendar.get(Calendar.YEAR);
			// Add one to month {0 - 11}
			
			//You need to be aware that month is zero based so when you do the getMonth you will need to add 1.
			//In the example below we have to add 1 to Januaray as 1 and not 0
			int month = calendar.get(Calendar.MONTH) + 1;
			int day = calendar.get(Calendar.DAY_OF_MONTH);
			datemap.put("year", year);
			datemap.put("month", month);
			datemap.put("day", day);

			calendar.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
			startDate = format.format(calendar.getTime());
			System.out.println("MONDAY: week start date " + startDate);
			calendar.add(Calendar.DATE, 6);
			endDate = format.format(calendar.getTime());
			System.out.println(" SUNDAY End Date of week sunday = " + endDate);
			System.out.println(date1);

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*
		 * datemap.put("year",year); datemap.put("month",month); datemap.put("day",day);
		 * System.out.println("year \t"+year); System.out.println("month \t"+month);
		 * System.out.println("day  \t"+day); System.out.println("\t"+date1);
		 * System.out.println("dayofweek "+dayofweek);
		 */
		return datemap;
	}

	// to get week date like monday and sunday.......................
	public Map<String, String> getweekDate() {
		Map<String, String> weekmap = new HashMap<String, String>();
		weekmap.put("startDate", startDate);
		weekmap.put("endDate", endDate);
		return weekmap;
	}

	// to get month start and end date ..........................
	public Map<String, String> getmonthStartAndEndDate(String date) {
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
		Calendar c = new GregorianCalendar();
		Date date1 = null;

		Map<String, String> monthdate = new HashMap<String, String>();
		try {
			date1 = format.parse(date);
			c.setTime(date1);

			int year = c.get(Calendar.YEAR);
			int month = c.get(Calendar.MONTH);
			int day = 1;
			c.set(year, month, day);
			int numOfDaysInMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);
			String startdatemonth = format.format(c.getTime());

			/*
			 * System.out.println("First Day of month string : " +startdatemonth);
			 * System.out.println("First Day of month: " + c.getTime());
			 */
			
			
			c.add(Calendar.DAY_OF_MONTH, numOfDaysInMonth - 1);
			String enddatemonth = format.format(c.getTime());

			monthdate.put("startdatemonth", startdatemonth);
			monthdate.put("enddatemonth", enddatemonth);
			
			  System.out.println("Last Day of month string: " + enddatemonth);
			  System.out.println("Last Day of month: " + c.getTime());
			 

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return monthdate;
	}
		
	// get prevoius month.......................
	public Date getPreviousMonthDate(String date) {
		Date preMonthDate=null;
		try {
			dateformat = format.parse(date);
			Calendar cal = Calendar.getInstance();  
		    cal.setTime(dateformat);
		     if(cal.get(Calendar.DATE)==31)
		     {
		    	 cal.add(Calendar.DATE, 30);
		    	 cal.add(Calendar.MONTH, -1); 
				    preMonthDate  = cal.getTime();  
				    
		     }
		    
		   // cal.set(Calendar.DAY_OF_MONTH, 1);  
		  //  cal.add(Calendar.DATE, -1);
		    cal.add(Calendar.MONTH, -1); 
		    preMonthDate  = cal.getTime();  
		    System.out.println("***********"+preMonthDate);
            System.out.println("*****************"+format.format(preMonthDate));
		}
		catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("***********"+preMonthDate);
        System.out.println("*****************"+format.format(preMonthDate));
		return preMonthDate;
	}
	
	public static String getformatDate(Date date)
	{
		
		 String mdy;
		SimpleDateFormat myformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			mdy = myformat.format(date);
		// System.out.println("*********55555555555555555***"+mdy);
		 return mdy;
		}
		catch(Exception e) {
              mdy="";
		//	System.out.println("gettttttt"+e);
			
		}
		//System.out.println("here is coming......");
		return mdy;
		
	}
	
	public static Date gettDate()
	{
		Date date=null;
		String pattern = "yyyy-MM-dd";
		SimpleDateFormat myformat = new SimpleDateFormat("");
 try {
		 date = myformat.parse("2001-01-01");
		return date;
 }
	catch (Exception e) {
		// TODO: handle exception
		
		System.out.print("fdddddddddd"+e);
	}	
	return date;
	}
	
	// get date for abhishek......
	
	public static Date gettDate(String d)
	{
		Date date=null;
		String pattern = "yyyy-MM-dd HH:mm:ss";
		SimpleDateFormat myformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
 try {
		 date = myformat.parse(d);
		return date;
 }
	catch (Exception e) {
		// TODO: handle exception
		
		System.out.print("fdddddddddd"+e);
	}	
	return date;
	}
	// to get page number ............................
	
	public static Integer pageNumber(Integer pageNmber)
	{
		if(pageNmber > 0) {
			return pageNmber-1;
		}
		else {
			return pageNmber;
		}
		
	}
}
	
