package com.event;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.event.repo.Event;
import com.event.repo.EventUser;
import com.event.service.EventService;
import com.event.service.EventUserService;

@Component
public class DataIntilizer implements CommandLineRunner{

	@Autowired
	private EventService eService;
	
	@Autowired
	private EventUserService userService;
	@Override
	public void run(String... args) throws Exception {

		
//		Event event1=new Event("Dancing", "Hyderabad", 740.00, LocalDate.of(2021,Month.JANUARY,13), 10, 15);
//		Event event2=new Event("Cooking", "Bangloree", 380.00, LocalDate.of(2021,Month.JANUARY,27), 15, 20);
//		Event event3=new Event("Drawing", "Bhimavaram", 480.00, LocalDate.of(2021,Month.FEBRUARY,15), 10, 17);
//		Event event4=new Event("Acting", "Chennai", 560.00, LocalDate.of(2021,Month.MARCH,6), 14, 20);
//		Event event5=new Event("Singing", "Jaipur", 640.00, LocalDate.of(2021,Month.APRIL,16), 09, 16);
//		
//		eService.addEvent(event1);
//		eService.addEvent(event2);
//		eService.addEvent(event3);
//		eService.addEvent(event4);
//		eService.addEvent(event5);
		
		
//		EventUser users1=new EventUser("mani","mani369",Arrays.asList("ROLE_ADMIN"));
//		
//		EventUser users2=new EventUser("vinne","vinne999",Arrays.asList("ROLE_CLERK"));
//		
//		userService.addUser(users1);
//		userService.addUser(users2);
	}

}
