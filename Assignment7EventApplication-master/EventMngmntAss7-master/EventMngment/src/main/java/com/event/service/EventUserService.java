package com.event.service;

import com.event.repo.EventUser;

public interface EventUserService {
	
	public EventUser addUser(EventUser users);
	public EventUser findByUsername(String username);

}
