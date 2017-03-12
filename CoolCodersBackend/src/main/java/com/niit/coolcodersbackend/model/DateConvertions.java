package com.niit.coolcodersbackend.model;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConvertions {
	
	public static long getDatetoLong(Date date){
		Long time=date.getTime();
		return time;
	}
	public static String getLongToDate(long time){
		
		
		 Date date = new Date(time);
		    Format format = new SimpleDateFormat("yyyy MM dd HH:mm:ss");
		    return format.format(date);
	}
//	public static void main(String[] args) {
//		long millis = new java.util.Date().getTime();
//		System.out.println(getLongToDate(millis));
//		Date cdt = new java.util.Date();
//		System.out.println(getDatetoLong(cdt));
		
//	}
}
