package com.event.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.event.repo.BookingResponse;
import com.event.repo.TicketBooking;
import com.event.repo.TicketCancelResponse;
import com.event.repo.TicketCancelling;
import com.event.service.EventService;

@RestController
@RequestMapping("clerk")
public class ClerkController {

	@Autowired
	private EventService eService;
	

	public ClerkController(EventService eService) {
		this.eService = eService;
	}
	@PostMapping(path="booking",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<BookingResponse> getBookingDetails(@RequestBody TicketBooking request){
		BookingResponse res=eService.bookTickets(request);
		return new ResponseEntity<BookingResponse>(res,HttpStatus.OK);
	}
	
	@PostMapping(path="cancelling",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<TicketCancelResponse> getCancelledDetails(@RequestBody TicketCancelling cancel){
		TicketCancelResponse can=eService.canceltickets(cancel);
		return new ResponseEntity<TicketCancelResponse>(can,HttpStatus.OK);
	}
	
}
