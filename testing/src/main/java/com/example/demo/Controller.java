package com.example.demo;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/days")
	public Days days(@RequestParam(value = "name", defaultValue = "NAME") String name, String date, String DOBdate, @RequestParam(value = "DOBmonth", defaultValue = "1") Integer DOBmonth, @RequestParam(value = "DOBday", defaultValue = "1") Integer DOBday, @RequestParam(value = "DOByear", defaultValue = "1900") Integer DOByear, String daysBetween) {
		return new Days(counter.incrementAndGet(), name, DOBmonth, DOBday, DOByear);
	}
	
	@GetMapping("/hours")
	public Hours hours(@RequestParam(value = "name", defaultValue = "NAME") String name, String date, String DOBdate, @RequestParam(value = "DOBmonth", defaultValue = "1") Integer DOBmonth, @RequestParam(value = "DOBday", defaultValue = "1") Integer DOBday, @RequestParam(value = "DOByear", defaultValue = "1900") Integer DOByear, String hoursBetween) {
		return new Hours(counter.incrementAndGet(), name, DOBmonth, DOBday, DOByear);
	}
	
	@GetMapping("/minutes")
	public Minutes minutes(@RequestParam(value = "name", defaultValue = "NAME") String name, String date, String DOBdate, @RequestParam(value = "DOBmonth", defaultValue = "1") Integer DOBmonth, @RequestParam(value = "DOBday", defaultValue = "1") Integer DOBday, @RequestParam(value = "DOByear", defaultValue = "1900") Integer DOByear, String minutesBetween) {
		return new Minutes(counter.incrementAndGet(), name, DOBmonth, DOBday, DOByear);
	}
}
