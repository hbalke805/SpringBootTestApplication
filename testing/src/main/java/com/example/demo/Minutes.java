package com.example.demo;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class Minutes {
	private final long id;
	private final String name;
	private final Calendar DOBdate;
	private final Calendar date;
	private final String minutesBetween;

	public Minutes(long id, String name, Integer DOBmonth, Integer DOBday, Integer DOByear) {
		this.id = id;
		this.name = name;
		
		Calendar d = Calendar.getInstance();
		d.set(Calendar.MONTH, d.get(Calendar.MONTH)+1);
		this.date=d;
		
		Calendar b = Calendar.getInstance();
		b.set(DOByear, DOBmonth, DOBday);
		this.DOBdate=b;
		
		this.minutesBetween=calculateMinutesBetween();
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDate() {
		return date.get(Calendar.MONTH) + "/" + date.get(Calendar.DATE) + "/" + date.get(Calendar.YEAR);
	}
	
	public String getDOBDate() {
		return DOBdate.get(Calendar.MONTH) + "/" + DOBdate.get(Calendar.DATE) + "/" + DOBdate.get(Calendar.YEAR);
	}
	
	public String calculateMinutesBetween() {
		long millisecondsDifference = Math.abs(date.getTime().getTime() - DOBdate.getTime().getTime());
		long minutesDifference = TimeUnit.MINUTES.convert(millisecondsDifference, TimeUnit.MILLISECONDS);
		return String.valueOf(minutesDifference);
	}

	public String getMinutesBetween() {
		return minutesBetween;
	}
}
